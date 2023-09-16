using System;
using System.Collections.Generic;

class teste{

    
    static void Main(){
        obterValores aux = new obterValores();
        List<Pessoa> teste1 = new List<Pessoa>();

        //for (int i = 0; i < 2; i++)
        //{
            aux.cadastroEvento();
        //}

        //for (int i = 0; i < 2; i++)
        //{
            aux.cadastroPessoa();
        //}
        foreach (var item in aux.eventos)
        {
            teste1 = item.vagas;
        }
        Console.WriteLine(teste1);

       
       
    }
}

class Pessoa{
    
    public string nome {get; set;}
    public int idade {get; set;}
    public string endereco {get; set;}
}
class Evento{
    
    public string nome {get; set;}
    public double preco {get; set;}
    public string endereco {get; set;}

    public List<Pessoa> vagas { get; set; }
    private Pessoa recebePessoa;
    public Pessoa lote
    {
        get { return recebePessoa; }
        set { vagas.Add(value); }
    }
}

class obterValores{


//eu preciso criar 
   // public List<Pessoa> pessoas = new List<Pessoa>();
    public List<Evento> eventos = new List<Evento>();
    //Evento teste = new Evento();

    
    

    public void cadastroPessoa(){
        Pessoa pessoaCadastro = new Pessoa();
        //List<Pessoa> pessoas = new List<Pessoa>();
        int i = 0;
        int escolha;
        
        Console.WriteLine("Digite seu nome");
        pessoaCadastro.nome = Console.ReadLine();

        Console.WriteLine("Digite sua idade");
        pessoaCadastro.idade = int.Parse(Console.ReadLine());

        Console.WriteLine("Digite seu endereço");
        pessoaCadastro.endereco = Console.ReadLine();
        

        Console.WriteLine("Qual evento deseja participar");
        foreach (Evento item in eventos)
        {
            Console.WriteLine("Numero do evento: " + i);
            Console.WriteLine("Nome do evento: " + item.nome);
            Console.WriteLine("Preco do evento: " + item.preco);
            i++;
        }
        escolha = int.Parse(Console.ReadLine());

        eventos[0].lote = pessoaCadastro;
        
        //eventos.Add(teste);
        
    }
    public void cadastroEvento(){
        Evento eventoCadastro = new Evento();

        Console.WriteLine("Digite o nome do evento");
        eventoCadastro.nome = Console.ReadLine();

        Console.WriteLine("Digite a localizaçao do evento");
        eventoCadastro.endereco = Console.ReadLine();

        Console.WriteLine("Digite o preço do evento");
        eventoCadastro.preco = double.Parse(Console.ReadLine());
        eventos.Add(eventoCadastro);
    }
}
