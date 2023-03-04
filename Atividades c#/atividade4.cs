using System;
class ativ4
{
    static void Main()
    {
        int a, b, c;
        Console.WriteLine("digite dois valores:");
        a = int.Parse(Console.ReadLine());
        b = int.Parse(Console.ReadLine());
        c = a + b;
        Console.WriteLine($"a soma de {a} + {b} = {c}");

    }
}