using System;
class ativ6
{
    static void Main()
    {
        int a;
        Console.WriteLine("digite um numero:");
        a = int.Parse(Console.ReadLine());
        Console.WriteLine("o antecessor de " + a + " é: " + (a - 1) + " e o sucessor é: " + (a+1));
    }
}