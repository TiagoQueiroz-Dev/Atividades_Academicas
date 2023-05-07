using System;
class cadastro{
    static void Main(){

    string Nome;
    char Sexo;
    int Idade;
    double Altura;

    Console.WriteLine("Iniciando seu cadastro!");

    Console.WriteLine("Digite seu nome:");
    Nome=Console.ReadLine();

    Console.WriteLine("Digite seu sexo F ou M:");
    Sexo= char.Parse(Console.ReadLine());

    Console.WriteLine("Digite sua idade:");
    Idade= int.Parse(Console.ReadLine());

    Console.WriteLine("Digite sua altura:");
    Altura= double.Parse(Console.ReadLine());

    Console.WriteLine("Suas informações:");
    Console.WriteLine("Nome:" + Nome);
    Console.WriteLine("Sexo:" + Sexo);
    Console.WriteLine("Idade:" +Idade);
    Console.WriteLine("Altura:"+ Altura);
    Console.WriteLine("Informações cadastradas com sucesso!!");
      

   
    




    }
}