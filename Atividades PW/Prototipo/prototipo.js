var express = require('express')
var {engine} = require('express-handlebars')
var bp = require('body-parser')
var op = express()
op.engine('handlebars', engine())
op.set('view engine', 'handlebars')
op.set('views', './views')
op.use(express.static('public'))
op.use(bp.json())
op.use(bp.urlencoded({extended: false}))
var teste = []

op.get('/',function(req,res){
    res.render('inicio',{teste})
})
op.get('/cadastro',function(req,res){
    res.render('cadastro')
})
op.post('/',function(req,res){
    nome = req.body.nome
    idade = req.body.idade    
    cadastro = {
        "nome": nome,
        "idade": idade
    }
    teste.push(cadastro)
    res.render('inicio',{teste})
})

op.listen(4090,function(){
    console.log('o host esta rodando na porta http://localhost:4090')
})