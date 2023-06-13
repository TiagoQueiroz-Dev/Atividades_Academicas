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
var usuario;
var senha;

ex.get('/',function(req,res){
    res.render('login')
})
ex.get('/rei',function(req,res){
    res.send('usuario: ' + usuario)
})
ex.get('/cadastro',function(req,res){
    res.render('cadastro')

    senha = req.body.senha;
    usuario = req.body.usuario;

})


ex.listen(3020,function(){
    console.log('o host esta rodando na porta http://localhost:3020');
})