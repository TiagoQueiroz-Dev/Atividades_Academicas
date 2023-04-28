
var usuario;
var senha;
var user;
var pass;

function login(){

    user = document.getElementById("user").value;
    pass = document.getElementById("pass").value;

    if(user == usuario && pass == senha){
        //document.getElementById("teste").innerHTML = "parabens voce logou";
        window.location.href = "../Atividades HTML/livros_css.html"
    }else if(user == "" || pass == ""){
        document.getElementById("teste").innerHTML = "Um campo nao foi preenchido";
    } else{
        document.getElementById("teste").innerHTML = "login ou senha incorretos";
    }
}
function testando(){
alert("Usuário" + user)
alert("senha" + pass)
}
function cadastro(){
    
    usuario = document.getElementById("user2").value;
    senha = document.getElementById("pass2").value;

    window.location.href = "../Pagina/pagina_de_login.html"
}
function ir(){
    window.location.href = "../Pagina/pagina_de_cadastro.html"
}