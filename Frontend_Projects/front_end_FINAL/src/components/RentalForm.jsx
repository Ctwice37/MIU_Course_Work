
import React, { useState, useEffect } from 'react';
import { useNavigate } from 'react-router-dom';
import DatePicker from 'react-datepicker';

import 'react-datepicker/dist/react-datepicker.css';
import { Button, Checkbox, FormControlLabel, List, ListItem, Typography, Grid, Paper, Box } from '@mui/material';
import {styled, ThemeProvider, Container} from '@mui/system';
import{createTheme} from '@mui/material/styles';


const theme = createTheme({
	palette: {
		primary: {
			main: '#4caf50',
		},
		secondary: {
			main: '#f44336',
		},
	},
});

const StyledListItem = styled(ListItem)(({ theme }) => ({
	cursor: 'pointer',
	'&:hover': {
		backgroundColor: theme.palette.action.hover,
	},
}));

const StyledPaper = styled(Paper)(({ theme }) => ({
	padding: theme.spacing(2),
	textAlign: 'center',
	color: theme.palette.text.secondary,
}));

const RentalForm = () => {
	const [customers, setCustomers] = useState([]);
	const [units, setUnits] = useState([]);
	const [selectedCustomer, setSelectedCustomer] = useState(null);
	const [selectedUnit, setSelectedUnit] = useState(null);
	const [pickupDate, setPickupDate] = useState(new Date());
	const [dropoffDate, setDropoffDate] = useState(new Date());
	const [isPaid, setIsPaid] = useState(false);
	const navigate = useNavigate();


	useEffect(() => {
		async function fetchCustomers() {
			try {
				const response = await fetch('http://localhost:8080/carRental/api/employee/customers',{
					headers: {
						'Content-Type': 'application/json'
					}});
				if(response.ok) {
					const data = await response.json();
					setCustomers(data.content);
				} else {
					console.error('Failed to fetch customers');
				}
			} catch (err) {
				console.error(`Error fetching customers: ${err}`);
			}
		}

		fetchCustomers().then(r => console.log(r));
	}, []);

	useEffect(() => {
		async function fetchAvailableUnits() {
			if(pickupDate && dropoffDate) {
				try {
					const response = await fetch(`http://localhost:8080/carRental/api/employee/available?startDate=${pickupDate.toISOString().split('T')[0]}&endDate=${dropoffDate.toISOString().split('T')[0]}`,{
					headers: {
						'Content-Type': 'application/json'
					}});
					if(response.ok) {
						const data = await response.json();
						setUnits(data.content);
					} else {
						console.error('Failed to fetch available units');
					}
				} catch (err) {
					console.error(`Error fetching available units: ${err}`);
				}
			}
		}

		fetchAvailableUnits().then(r => console.log(r));
	}, [pickupDate, dropoffDate]);


	const handleSubmit = async (event) => {
		event.preventDefault();

		if (dropoffDate <= pickupDate) {
			alert('Drop off date must come after pickup date');
			return;
		}

		const rentalData = {
			customer: selectedCustomer,
			unit: selectedUnit,
			pickupDate,
			dropoffDate,
			isPaid,
		};

		const response = await fetch('http://localhost:8080/carRental/api/employee/createRental', {
			method: 'POST',
			headers: {
				'Content-Type': 'application/json',
			},
			body: JSON.stringify(rentalData),
		});

		alert(`HTTP Status Code: ${response.status}`);
	};


	return (
		<ThemeProvider theme={theme}>
			<Container maxWidth="sm">
				<StyledPaper elevation={3} style={{ padding: '20px', marginTop: '20px' }}>
					<Typography variant="h3">Rental Form</Typography>
					<form onSubmit={handleSubmit}>
						<Typography variant="h5">Customer</Typography>
						<Button variant="contained" onClick={() => navigate('/create-customer')}>
							Create Customer
						</Button>
						<List>
							{customers.map((customer) => (
								<ListItem key={customer.id} onClick={() => setSelectedCustomer(customer)}>
									{customer.firstName} {customer.lastName}
								</ListItem>
							))}
						</List>
						<Typography variant="h5">Pickup Date</Typography>
						<DatePicker selected={pickupDate} onChange={date => setPickupDate(date)} minDate={new Date()} />
						<Typography variant="h5">Drop Off Date</Typography>
						<DatePicker selected={dropoffDate} onChange={date => setDropoffDate(date)} minDate={pickupDate} />
						<Typography variant="h5">Units</Typography>
						{units.length ? (
							<List>
								{units.map((unit) => (
									<ListItem key={unit.id} onClick={() => setSelectedUnit(unit)}>
										Make: {unit.car.make}, Model: {unit.car.model}, Year: {unit.car.year}, License Plate: {unit.plateNumber}
									</ListItem>
								))}
							</List>
						) : (
							<Typography variant="body1">No available units for the selected date range</Typography>
						)}
						<Typography variant="h5">Payment</Typography>
						<FormControlLabel control={
							<Checkbox checked={isPaid} onChange={(e) => setIsPaid(e.target.checked)} />
						} label="Paid" />
						<Button type="submit" variant="contained" style={{ marginTop: '20px' }}>Submit</Button>
					</form>
				</StyledPaper>
			</Container>
		</ThemeProvider>
	);
};

export default RentalForm;