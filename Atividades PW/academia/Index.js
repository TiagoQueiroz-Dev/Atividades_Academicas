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
var cadastro = []

ex.get("/",function(req,res){
    res.render('inicio')
})
ex.get("/contato",function(req,res){
    res.render('contato')
})
ex.post("/contato",function(req,res){
    res.render('inicio')
})
ex.get("/horarios",function(req,res){
    res.render('horarios')
})
ex.get("/quemsomos",function(req,res){
    res.render('quemSomos')
})
ex.get("/cadastro",function(req,res){
    res.render('cadastro', {cadastro})
})
ex.post("/",function(req,res){
    var nome = req.body.nome
    var telefone = req.body.telefone
    var horario = req.body.horario
    var email = req.body.email

    cast = {
        "nome" : nome,
        "telefone" : telefone,
        "horario" : horario,
        "email" : email
    }
    cadastro.push(cast)
    res.render('cadastro',{cadastro})
})

ex.listen(666,function(){
    console.log('o host esta rodando na porta http://localhost:666');
})