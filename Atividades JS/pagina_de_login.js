function teste(){

    var user = document.getElementById("user").value;
    var pass = document.getElementById("pass").value;

    if(user == "Tiago" && pass == "2468"){
        document.getElementById("teste").innerHTML = "parabens voce logou";
    }else if(user == "" || pass == ""){
        document.getElementById("teste").innerHTML = "Um campo nao foi preenchido";
    } else{
        document.getElementById("teste").innerHTML = "login ou senha incorretos";
    }