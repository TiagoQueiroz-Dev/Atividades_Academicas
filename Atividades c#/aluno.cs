using System;
class aula03{
    
  static void Main(){

int valor1, valor2, valor3, resp;

Console.WriteLine("Digite um número:");
valor1 = int.Parse(Console.ReadLine());
Console.WriteLine("Digite um número:");
valor2 = int.Parse(Console.ReadLine());
Console.WriteLine("Digite um número:");
valor3 = int.Parse(Console.ReadLine());

resp = operacao(valor1,valor2,valor3);

Console.WriteLine("O resultado final é " + resp +  "!");

}

static int operacao(int n1, int n2, int n3){

return (n1 + n2) * n3; 
}
}