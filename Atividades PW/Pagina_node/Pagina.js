var express = require('express')
var {engine} = require('express-handlebars')
var app = express()

app.engine('handlebars', engine());
app.set('view engine', 'handlebars');
app.set('views', './views');

app.use(express.static('Public'))


app.get('/', function(req,res){
    res.send("naao sei")
})
app.get('/sobreNos',function(req,res){
    res.render('home')
})
app.get('/rei',function(req,res){
    res.render('teste')
})
app.get('/a',function(req,res){
    res.send('Bolsa')
})

app.listen(3000, function(){
    console.log("servidor funcionando em http://localhost:3000");
})