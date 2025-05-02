import React from 'react';
import { BrowserRouter as Router, Route, Routes } from 'react-router-dom';
import Home from './components/Home'; // ensure this is the correct path to your Home component
import CustomerForm from './components/CustomerForm';
import RentalForm from "./components/RentalForm";

const App = () => {
    return (
        <Router>
            <Routes>
                <Route path="/create-customer" element={<CustomerForm />} />
                <Route path={"/create-Rental"} element={<RentalForm />} />
                <Route path="/" element={<Home />} />
            </Routes>
        </Router>
    );
};

export default App;
