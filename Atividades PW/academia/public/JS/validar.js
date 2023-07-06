function validar(){
    let nome = document.getElementById('nome').value;
    let email = document.getElementById('email').value;
    let telefone = document.getElementById('telefone').value;
    let descricao = document.getElementById('descricao').value;


    if(nome == ""){
        alert('insira um nome por gentileza')
    }else if(email == ""){
        alert('insira um email por gentileza')
    }else if(telefone == ""){
        alert('insira um telefone por gentileza')
    }else if(descricao == ""){
        alert('insira uma descricao por gentileza')
    }else{
        alert('informacoes enviadas com sucesso')
    }

    return false;
}