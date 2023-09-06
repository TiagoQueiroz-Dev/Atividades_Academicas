using System;
class cadastro{

  static void Main(){

    string[] nome = new string [2];
    int[] idade = new int [2];
    int[] peso = new int [2];
    int[] altura = new int [2];

    for(int n=0; n<2;n++){
      Console.WriteLine("Digite seu nome");
      nome[n] = Console.ReadLine();

      Console.WriteLine("Digite sua idade");
      idade[n] = int.Parse(Console.ReadLine());

      Console.WriteLine("Digite seu peso");
      peso[n] = int.Parse(Console.ReadLine());

      Console.WriteLine("Digite sua altura");
      altura[n] = int.Parse(Console.ReadLine());
      }

    for(int n=0; n<2;n++){

      Console.WriteLine(" Seja bem vindo" + nome[n] + " sua idade" + idade[n] + " seu peso "+ peso[n] + "sua altura " + altura[n]);

    }

  }
}