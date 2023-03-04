using System;
class ativ2{
    static void Main(){
        int valor1,valor2,valor3,media;
        Console.WriteLine("digite 3 valores");
        valor1 = int.Parse(Console.ReadLine());
        valor2 = int.Parse(Console.ReadLine());
        valor3 = int.Parse(Console.ReadLine());
        media = (valor1+valor2+valor3)/3;
        Console.WriteLine("a medeia dos valores é: {0}", media);
    }
}