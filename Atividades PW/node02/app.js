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

var cadastros = []
var usuario
var senha

// ex.post('/',function(req,res){
//     res.render('login')
// })
ex.get('/',function(req,res){
    res.render('login')

})
ex.post('/',function(req,res){
    usuario = req.body.usuario
    senha = req.body.senha
    
    cast = {
        "nome":usuario,
        "senha":senha
    }
    cadastros.push(cast)
   // res.render('imprimir',{cadastros})
   res.render('/rei',{cadastros})
    
})

 ex.post('/rei',function(req,res){
    res.render('imprimir',{cadastros})
 })

// ex.get('/cadastro',function(req,res){
//     res.render('cadastro')
// })


ex.listen(3020,function(){
    console.log('o host esta rodando na porta http://localhost:3020');
})