var soma = require('./soma')
var subtrair = require('./subtrair')

console.log(soma(15,19))
console.log(subtrair(20,7))

var http = require('http')

http.createServer(function(req,res){
    res.end("<h1> HELLO WORLD!</h1>")
}).listen(3000)

console.log("Servidor funcionando na porta 3000")