const express = require('express');
const routers = express.Router();
const Car = require('../models/Car')
const User = require('../models/Users')
const path = require('path');
const { dir } = require('console');



// Car Queries

routers.get('/', async (req, res) => {

    const carQuery = await Car.find();
    res.json(carQuery);
});



//User Queries

routers.get('/auth', async (req, res) => {

    User.exists({ email: req.query.email, password: req.query.password }, function (err, doc) {
        if (err) {
            console.log(err)
        } else if (doc != null) {
           res.redirect('/cars')
        }
        else {
            res.redirect('back')
        
        }
    });

    res.status(200)
});


module.exports = routers
