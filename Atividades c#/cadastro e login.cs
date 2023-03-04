using System;
class program
{
    static void Main()
    {
        string nome = "0"; 
        string email = "0";
        int numero = 0;
        double CPF = 0;
        string usuario;
        double senha;

        Login(ref nome,ref email,ref numero,ref CPF);
        Console.Clear();
        Console.WriteLine("seu usuario é: {0}\n" + "sua senha é: {1}\n",nome,CPF);
        Console.WriteLine("precione enter");
        Console.ReadKey();
        Console.Clear();
        inicio:
        Console.Clear();

        Console.WriteLine("------------------------------------\n" + "               LOGIN\n" + "------------------------------------");
        Console.WriteLine("digite seu usuario");
        usuario = Console.ReadLine();
        Console.WriteLine("digite sua senha:");
        senha = double.Parse(Console.ReadLine());
        if(usuario == nome & senha == CPF)
        {
            Console.Clear();
            Console.WriteLine("seja bem vindo");
        }
        else
        {
            Console.Clear();
            Console.WriteLine("login ou senha errados... tente novamente");
            Console.WriteLine("precione enter");
            Console.ReadKey();
            goto inicio;
        }
    }
    static void Login(ref string nome, ref string email, ref int numero, ref double CPF)
    {
        Console.WriteLine("digite seu nome:");
        nome = Console.ReadLine();
        Console.WriteLine("digite seu email:");
        email = Console.ReadLine();
        Console.WriteLine("digite seu numero");
        numero = int.Parse(Console.ReadLine());
        Console.WriteLine("digite seu CPF");
        CPF = double.Parse(Console.ReadLine());
    }
}
