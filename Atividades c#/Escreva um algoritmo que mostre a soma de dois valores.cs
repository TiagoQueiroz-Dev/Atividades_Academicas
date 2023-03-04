using System;
class ativ1{
    static void Main(){
        int valor1, valor2,resultado;
        Console.WriteLine("digite dois valores");
        valor1 = int.Parse(Console.ReadLine());
        valor2 = int.Parse(Console.ReadLine());
        resultado = valor1 + valor2;
        Console.WriteLine($"o resultado da soma dos valores {valor1} + {valor2} é igual a {resultado}");

    }
}