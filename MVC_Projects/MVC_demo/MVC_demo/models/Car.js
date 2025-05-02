const mongoose = require('mongoose')
const express = require('express')

const CarSchema = mongoose.Schema({
    new_used: {
        type: String,
        required: true
    },
    make: {
    type: String,
    required: true
    }, 

    model: {
        type: String,
        required: true
    }

});


module.exports = mongoose.model('Car', CarSchema)