function estelionato(){
    let form1 = document.getElementById("nome").value;
    let form2 = document.getElementById("telefone").value;
    let form3 = document.getElementById("email").value;
    if(form1 != "" && form2 != "" && form3 != ""){
        alert("Obrigado por preencher, entraremos em contato");
    }else{
        alert("Confira os campos");
    }
    return false;
}