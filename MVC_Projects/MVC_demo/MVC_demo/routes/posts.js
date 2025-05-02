const express = require('express');
const routers = express.Router();
const Car = require('../models/Car')
const User = require('../models/Users')


routers.post('/', (req, res)=> {

    console.log(req.body)
    const post = new Car({                         //new database entry using the schema defined in Post.js
            new_used: req.body.new_used,
            make: req.body.make,
            model: req.body.model,
           
    });

     post.save()
     
        
        .then(data => {
            res.json(data)
        })
    
})





module.exports = routers;