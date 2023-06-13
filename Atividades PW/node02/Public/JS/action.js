let user;
let pass;

function validar(){
    var usuario = document.getElementById("user").value;
    var senha = document.getElementById("pass").value;

     if(usuario == "tiago" && senha == "123"){
        // window.open("http://localhost:3020/rei");
        // document.getElementById("log").innerHTML = "testando";
        return true;
     }else{
        // window.open("http://localhost:3020/ala");
        document.getElementById("erro").innerHTML = "Algo de errado nao esta certo";
        return false;
     }
}
function cadastro(){
   user = document.getElementById("user").value;
   pass = document.getElementById("pass").value;
}