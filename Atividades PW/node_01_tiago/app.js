var http = require('http')

http.createServer(function(req,res){
    res.end("hello world!")
}).listen(8090)

console.log("servidor es funcionando na porta http://localhost:8090")