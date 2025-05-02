import React, { useState } from 'react';
import { useLocation, useNavigate } from 'react-router-dom';
import { Grid} from '@mui/material';
import { TextField, Button, Container, Box, Typography } from '@mui/material';



const CustomerForm = () => {
	const [firstName, setFirstName] = useState("");
	const [lastName, setLastName] = useState("");
	const [email, setEmail] = useState("");
	const [street, setStreet] = useState("");
	const [city, setCity] = useState("");
	const [state, setState] = useState("");
	const [zip, setZip] = useState("");
	const [cardNumber, setCardNumber] = useState("");
	const [expiryDate, setExpiryDate] = useState("");
	const [cvv, setCvv] = useState("");
	const navigate = useNavigate();
	const location = useLocation();
	const from = location.state?.from;

	const handleSubmit = (e) => {
		e.preventDefault();

		// const newCustomer = {
		// 	firstName,
		// 	lastName,
		// 	email,
		// 	address: { street, city, state, zip },
		// 	paymentCard: { cardNumber, expiryDate, cvv },
		// };

		const newCustomer = {
			firstName,
			lastName,

		};

		fetch('http://localhost:8080/carRental/api/employee/addcustomer', {
			method: 'POST',
			headers: {
				'Content-Type': 'application/json'
			},
			body: JSON.stringify(newCustomer)
		})
			.then(response => {
				window.alert(`Response status: ${response.status}`);
				// Check if customer was added successfully
				if (response.status === 201) {
					// If the navigation came from the RentalForm
					if (from === 'rentalForm') {
						navigate('/create-Rental'); // Navigate back to the RentalForm
					} else {

					}
				}
				return response.json();
			})
			.then(data => console.log(data))
			.catch((error) => {
				console.error('Error:', error);
			});
	};

	return (
		<Container>
			<form onSubmit={handleSubmit}>
				<Typography variant="h4" align="center" gutterBottom>
					Create Customer
				</Typography>
				<Grid container spacing={2}>
					<Grid item xs={12} sm={6}>
						<TextField label="First Name" value={firstName} onChange={(e) => setFirstName(e.target.value)} fullWidth />
					</Grid>
					<Grid item xs={12} sm={6}>
						<TextField label="Last Name" value={lastName} onChange={(e) => setLastName(e.target.value)} fullWidth />
					</Grid>
					<Grid item xs={12}>
						<TextField label="Email" value={email} onChange={(e) => setEmail(e.target.value)} fullWidth />
					</Grid>
					<Grid item xs={12}>
						<TextField label="Street" value={street} onChange={(e) => setStreet(e.target.value)} fullWidth />
					</Grid>
					<Grid item xs={12} sm={6}>
						<TextField label="City" value={city} onChange={(e) => setCity(e.target.value)} fullWidth />
					</Grid>
					<Grid item xs={12} sm={6}>
						<TextField label="State" value={state} onChange={(e) => setState(e.target.value)} fullWidth />
					</Grid>
					<Grid item xs={12} sm={6}>
						<TextField label="ZIP" value={zip} onChange={(e) => setZip(e.target.value)} fullWidth />
					</Grid>
					<Grid item xs={12} sm={6}>
						<TextField label="Card Number" value={cardNumber} onChange={(e) => setCardNumber(e.target.value)} fullWidth />
					</Grid>
					<Grid item xs={12} sm={6}>
						<TextField label="Expiry Date" value={expiryDate} onChange={(e) => setExpiryDate(e.target.value)} fullWidth />
					</Grid>
					<Grid item xs={12} sm={6}>
						<TextField label="CVV" value={cvv} onChange={(e) => setCvv(e.target.value)} fullWidth />
					</Grid>
					<Grid item xs={12}>
						<Button variant="contained" color="primary" type="submit">
							Submit
						</Button>
					</Grid>
				</Grid>
			</form>
		</Container>
	);
};

export default CustomerForm;