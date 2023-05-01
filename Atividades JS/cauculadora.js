function teste(){
    let num1 = document.getElementById("num1").value;
    let num2 = document.getElementById("num2").value;
    let operador = document.getElementById("operador").value;
    let resultado;
    
    if(operador == "+"){
        resultado = parseInt(num1) + parseInt(num2);
    }else
    if(operador == "-"){
        resultado = (num1 - num2);
    }else
    if(operador == "*"){
        resultado = (num1 * num2);
    }else
    if(operador == "/"){
        resultado = (num1 / num2);
    }else
    if(operador == ""){
        resultado = "Selecione Um Operador";
    }
    
    document.getElementById("resultado").innerHTML = resultado;
    
    return false;

}