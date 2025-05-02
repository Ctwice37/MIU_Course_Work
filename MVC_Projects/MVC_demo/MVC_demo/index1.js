var express = require("express");
var app = express();
var ejs = require("ejs");
var path = require("path");
var cookieParser = require("cookie-parser");
const { stringify } = require("querystring");
const { Console } = require("console");
const { response } = require("express");
const mongoose = require('mongoose');
const bodyParser = require('body-parser')

// Import Routes
const postsRoute = require('./routes/posts');
const queriesRoute = require('./routes/queries');



//Set up default mongoose connection
var mongoDB = 'mongodb://127.0.0.1:27017/cars';

mongoose.connect(mongoDB, {
    useNewUrlParser: true,
    useUnifiedTopology: true
}, (err)=> {
        if(!err) console.log("Mongoose connected!")
});

app.listen(3000, () => {
    console.log("Server Running on port 3000")
})

//Read the parameters from post request
app.use(cookieParser());
app.use(express.json({
    urlencoded: true
}));
app.use(express.urlencoded({ extended: false }));

app.set('view engine', 'html');
app.engine('html', ejs.renderFile);


//Middleware
app.use('/posts', postsRoute)
app.use('/queries', queriesRoute)



app.get('/', (req, res) => {

    res.sendFile(path.join(__dirname,"pages", "login.html"))
});



// app.get('/login', (req, res) => {

//     res.sendFile(path.join(__dirname,"pages", "login.html"))

// });

app.get('/cars', (req, res) => {

    // res.sendFile(path.join(__dirname, "pages", "cars.html"))
    res.sendFile(path.join(__dirname, "pages", "Cars_2.html"))
})






