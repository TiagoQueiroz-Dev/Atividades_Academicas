using System;
class ativ5
{
    static void Main()
    {
        float a, b, c;
        Console.WriteLine("diga as duas notas do aluno;");
        a = float.Parse(Console.ReadLine());
        b = float.Parse(Console.ReadLine());
        c = (a + b) / 2;
        Console.WriteLine("a media entre: {0} e {1} é igual a: {2}",a,b,c);
    }
}