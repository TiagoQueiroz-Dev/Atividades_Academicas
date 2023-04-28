
var usuario;
var senha;

function login(){

    var user = document.getElementById("user").value;
    var pass = document.getElementById("pass").value;

    if(user == "admin" && pass == "admin"){
        //document.getElementById("teste").innerHTML = "parabens voce logou";
        window.location.href = "../Atividades HTML/livros_css.html"
    }else if(user == "" || pass == ""){
        document.getElementById("teste").innerHTML = "Um campo nao foi preenchido";
    } else{
        document.getElementById("teste").innerHTML = "login ou senha incorretos";
    }
}
function cadastro(){
    
    usuario = document.getElementById("user2").value;
    senha = document.getElementById("pass2").value;

    window.location.href = "../Pagina/pagina_de_login.html"
}
function ir(){
    window.location.href = "../Pagina/pagina_de_cadastro.html"
}