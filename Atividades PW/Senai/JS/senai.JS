var nome = prompt("digite seu nome");
var hora = new Date();
var horas = hora.getHours();

function bemvindo(){
    if (horas < 12){
        document.write("Bom Dia " + nome + "!"); 
    }
    else if (horas < 18){
        document.write("Boa Tarde " + nome + "!");
    }
    else if (horas < 24){
        document.write("Boa Noite " + nome + "!");
    }
}