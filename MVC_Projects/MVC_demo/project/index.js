var express = require('express');
var app = express();
var ejs = require("ejs");
var path = require("path");
var cookieParser = require("cookie-parser");
//const { stringify } = require("querystring");
//const { Console } = require("console");
//const { response } = require("express");
const mongoose = require('mongoose');
const bodyParser = require('body-parser')

//Set up default mongoose connection
var mongoDB = 'mongodb://127.0.0.1:27017/demoDB';

app.listen(3000,function(){
    console.log("Server running on Port: 3000");
});


mongoose.connect(mongoDB, {
    useNewUrlParser: true,
    useUnifiedTopology: true
}, (err)=> {
        if(!err) console.log("Mongoose connected!")
});

//Read the parameters from post request
app.use(cookieParser());
app.use(express.json());
app.use(express.urlencoded({ extended: false }));

app.set('view engine', 'html');
app.engine('html', ejs.renderFile);

//BodyParser

// app.use(bodyParser.json);

// // Import Routes
// const postsRoute = require('./routes/posts');


// //Middleware
// app.use('/routes', postsRoute)


// ROUTES
app.get('/', function(req, res){
    res.send('This is a page');
})














