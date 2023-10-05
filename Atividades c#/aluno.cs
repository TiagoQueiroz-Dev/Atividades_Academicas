  using System;
class cadastro{

  static void Main(){

    login();
  }

  static void login(){

    string usuario; 
    int senha;
    Console.WriteLine("Digite seu usuario: ");
    usuario = Console.ReadLine();
    Console.WriteLine("Digite sua senha: ");
    senha = int.Parse(Console.ReadLine());

    validacao(usuario, senha);

  }

  static void validacao(string usuario, int senha){
          
    string[] usuarioLogin = new string[3];

    usuarioLogin[0] = "Simony";
    usuarioLogin[1] = "Tiago";
    usuarioLogin[2] = "Malu";

    int[] senhaLogin = new int[3];

    senhaLogin[0] = 1234;
    senhaLogin[1] = 1234;
    senhaLogin[2] = 1234;

    for (int i = 0; i < 3; i++){

    if(usuario == usuarioLogin[i] && senha == senhaLogin[i]){
    
    Console.WriteLine("Bem vindo ao sistema " + usuario);}

    else{

    for (int n = 0; n > 0; n++){

    Console.WriteLine("Acesso bloqueado!");

    }          
  }
}
          

        }




}