var express = require('express')
var {engine} = require('express-handlebars')
var bp = require('body-parser')
var ex = express()

ex.engine('handlebars', engine());
ex.set('view engine', 'handlebars');
ex.set('views', './views');

ex.use(express.static('Public'))
ex.use(bp.urlencoded({extended: false}))
ex.use(bp.json())

ex.get("/",function(req,res){
    res.render('inicio')
})

ex.listen(666,function(){
    console.log('o host esta rodando na porta http://localhost:666');
})