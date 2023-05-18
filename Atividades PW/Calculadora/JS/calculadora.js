function teste(){
    let num1 = document.getElementById("num1").value;
    let num2 = document.getElementById("num2").value;
    let operador = document.getElementById("operador").value;
    let resultado;
    
    if(isNaN(num1) || isNaN(num2)){
        resultado = "isso nao é um numero cabeça";
        alert (resultado);
    }else if(operador == "+"){
        resultado = parseInt(num1) + parseInt(num2);
    }else
    if(operador == "-"){
        resultado = (num1 - num2);
        alert (resultado);
    }else
    if(operador == "*"){
        resultado = (num1 * num2);
        alert (resultado);
    }else
    if(operador == "/"){
        resultado = (num1 / num2);
        alert (resultado);
    }else
    if(operador == ""){
        resultado = "Selecione Um Operador Idiota";
        alert (resultado);
    }
    
    document.getElementById("resultado").innerHTML = "Resultado "+resultado;
    
    return false;

}