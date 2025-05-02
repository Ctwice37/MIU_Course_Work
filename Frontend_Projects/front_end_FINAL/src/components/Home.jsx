
import React from 'react';
import { AppBar, Toolbar, Typography, Box } from '@mui/material';
import IconButton from '@mui/material/IconButton';
import SvgIcon from '@mui/material/SvgIcon';
import { Link } from 'react-router-dom';

const Home = () => {
	const carLogo = (props) => (
		<SvgIcon {...props}>
			<path d="M22 6h-20c-1.1 0 -1.99 0.9 -1.99 2l-1 6v6h2v-2h20v2h2v-6c0-1.1-0.9-2-2-2zm-1 9h-18v-5h18v5zm2-6c-1.1 0-2-0.9-2-2s0.9-2 2-2 2 0.9 2 2-0.9 2-2 2z"/>
		</SvgIcon>
	);

	return (
		<div>
			<AppBar position="static">
				<Toolbar>
					<IconButton edge="start" color="inherit" aria-label="menu" sx={{ mr: 2 }}>
						<carLogo />
					</IconButton>
					<Typography variant="h6" component="div" sx={{ flexGrow: 1 }}>
						Car Rental Now
					</Typography>
					<Link to="/create-customer" style={{ color: 'white', textDecoration: 'none' }}>Create New Customer</Link>
					<Link to="/create-rental" style={{ color: 'white', textDecoration: 'none', marginLeft: '10px' }}>Create New Rental</Link>
				</Toolbar>
			</AppBar>
			<Box
				display="flex"
				justifyContent="center"
				alignItems="center"
				minHeight="80vh"
			>
				<carLogo sx={{ fontSize: 60 }} />
			</Box>
		</div>
	);
};

export default Home;
