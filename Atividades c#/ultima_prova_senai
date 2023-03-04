using System;

struct Aluno
{

    public string nome;
    public int idade;
    public double nota1;
    public double nota2;
    public double media;

}

class Program
{

    static void Main()
    {

        Aluno[] aluno = new Aluno[2];
        int op,aux;
        int indicador = 0;
        aux = 0;


        Cadastro(ref aluno);

        inicio:

        Menu();

        op = int.Parse(Console.ReadLine());

        switch (op)
        {
            case 1:

                Console.Clear();

                Imprimir(ref aluno);


            break;

            case 2:

                Console.Clear();

                Media_aprovados(ref aluno);
                
            break;

            case 3:

                Console.Clear();

                Media_reprovados(ref aluno);

            break;

            case 4:

                Console.Clear();

                Todas_situacoes(ref aluno);

            break;

            case 5:

                Console.Clear();

                Maiores_que_certa_idade(ref aluno);

            break;

            case 6:

                Console.Clear();

                indicador =  Mais_novo(ref aluno);

                Console.WriteLine("Aluno mais novo: {0}",aluno[indicador].idade);

                Console.ReadKey();

                Console.Clear();

            break;

            case 7:

                Console.Clear();

                indicador = Mais_velho(ref aluno);

                Console.WriteLine("Aluno mais velho: {0}", aluno[indicador].idade);

                Console.ReadKey();

                Console.Clear();

            break;

            case 8:

                Console.Clear();

                Buscar_aluno(ref aluno);

            break;
            case 9:

                aux++;

            break;

            default:

                Console.Clear();

                Console.WriteLine("Opçao desejada invalida");

                Console.Clear();

                Console.ReadKey();

            break;

        }

        if(aux != 1)
        {
            goto inicio;
        }

        Console.Clear();

    }
    static void Cadastro(ref Aluno[] aluno_cadastro)
    {

        int i;

        for(i = 0;i < aluno_cadastro.Length;i++)
        {

            //Console.WriteLine(i + 1);

            Console.WriteLine("digite seu nome");
            aluno_cadastro[i].nome = Console.ReadLine();

            Console.WriteLine("digite sua idade");
            aluno_cadastro[i].idade = int.Parse(Console.ReadLine());

            Console.WriteLine("digite sua primeira nota");
            aluno_cadastro[i].nota1 = int.Parse(Console.ReadLine());

            Console.WriteLine("digite sua segunda nota");
            aluno_cadastro[i].nota2 = int.Parse(Console.ReadLine());

            aluno_cadastro[i].media = (aluno_cadastro[i].nota1 + aluno_cadastro[i].nota2) / 2;

            Console.Clear();

        }

    }

    static void Imprimir(ref Aluno[] aluno_imprimir)
    {

        int i;

        for (i = 0; i < aluno_imprimir.Length; i++)
        {

            Console.WriteLine("nome: {0}", aluno_imprimir[i].nome);
            Console.WriteLine("idade: {0}", aluno_imprimir[i].idade);
            Console.WriteLine("Media: {0}", aluno_imprimir[i].media);
            Console.WriteLine(" ");

        }

        Console.ReadKey();

        Console.Clear();

    }

    static void Menu()
    {

        Console.WriteLine("Digite a opçao desejada:");
        Console.WriteLine("1 - Imprimir todos cadastros");
        Console.WriteLine("2 - Mostrar nome e media dos APROVADOS");
        Console.WriteLine("3 - Mostrar nome e media dos REPROVADOS");
        Console.WriteLine("4 - Mostrar nome e media de todos com APROVADOU ou REPROVADO");
        Console.WriteLine("5 - Mostrar todos os cadastros maiores que certa idade");
        Console.WriteLine("6 - Imprimir o nome da pessoa mais nova");
        Console.WriteLine("7 - Imprimir o nome da pessoa mais velha");
        Console.WriteLine("8 - Buscar aluno espesifico");
        Console.WriteLine("9 - Sair");
        
    }

    static void Media_aprovados(ref Aluno[] aluno_media_aprovados)
    {
        int i,cont;

        cont = 0;

        for (i = 0; i < aluno_media_aprovados.Length; i++)
        {

            if (aluno_media_aprovados[i].media >= 7)
            {

                Console.WriteLine("++++++++++++APROVADOS++++++++++++");
                Console.WriteLine("Nome: {0}",aluno_media_aprovados[i].nome);
                Console.WriteLine("Media: {0}",aluno_media_aprovados[i].media);
                Console.WriteLine(" ");

                cont++;

            }
            else if (aluno_media_aprovados[i].media < 7 && cont == 0)
            {

                Console.WriteLine("Não há aluns APROVADOS");

            }

        }

        Console.ReadKey();

        Console.Clear();

    }

    static void Media_reprovados(ref Aluno[] aluno_media_reprovados)
    {

        int i,cont;

        cont = 0;

        for (i = 0; i < aluno_media_reprovados.Length; i++)
        {

            if (aluno_media_reprovados[i].media < 7)
            {

                Console.WriteLine("===========REPROVADOS===========");
                Console.WriteLine("Nome: {0}", aluno_media_reprovados[i].nome);
                Console.WriteLine("Media: {0}", aluno_media_reprovados[i].media);
                Console.WriteLine(" ");
                cont++;

            }
            else if (aluno_media_reprovados[i].media >= 7 && cont == 0)
            {

                Console.WriteLine("Não há aluns REPROVADOS");

            }
            
        }

        Console.ReadKey();

        Console.Clear();

    }

    static void Todas_situacoes(ref Aluno[] todas_situacoes)
    {

        int i;

        for (i = 0; i < todas_situacoes.Length; i++)
        {

            if (todas_situacoes[i].media >= 7)
            {

                Console.WriteLine("++++++++++++APROVADO++++++++++++");
                Console.WriteLine("Nome: {0}", todas_situacoes[i].nome);
                Console.WriteLine("Media: {0}", todas_situacoes[i].media);
                Console.WriteLine(" ");

            }
            else
            {

                Console.WriteLine("===========REPROVADO===========");
                Console.WriteLine("Nome: {0}", todas_situacoes[i].nome);
                Console.WriteLine("Media: {0}", todas_situacoes[i].media);
                Console.WriteLine(" ");

            }

        }

        Console.ReadKey();

        Console.Clear();

    }

    static void Maiores_que_certa_idade(ref Aluno[] idade)
    {

        int i,define;

        Console.WriteLine("digite a idade minima que deja verificar");
        define = int.Parse(Console.ReadLine());


        for(i = 0; i < idade.Length; i++)
        {

            if (idade[i].idade >= define)
            {

                Console.WriteLine("nome: {0}", idade[i].nome);
                Console.WriteLine("idade: {0}", idade[i].idade);
                Console.WriteLine("Media: {0}", idade[i].media);
                Console.WriteLine(" ");

            }

        }

        Console.ReadKey();

        Console.Clear();

    }

     static int Mais_novo(ref Aluno[] aluno_mais_novo)
    {

        int i,aux,indicador;

        indicador = 0;

        aux = 999;

        for(i = 0; i < aluno_mais_novo.Length; i++)
        {

            if (aluno_mais_novo[i].idade < aux)
            {

                aux = aluno_mais_novo[i].idade;

                indicador = i;

            }

        }

        return indicador;

    }

    static int Mais_velho(ref Aluno[] aluno_mais_velho)
    {

        int i,indicador,aux;

        indicador = 0;

        aux = 0;

        for(i = 0;i < aluno_mais_velho.Length; i++)
        {

            if (aluno_mais_velho[i].idade > aux)
            {

                aux = aluno_mais_velho[i].idade;

                indicador = i;

            }

        }

        return indicador;

    }

    static void Buscar_aluno(ref Aluno[] buscar_aluno)
    {
        int i,cont;
        cont = 0;
        string nome_aluno;

        Console.WriteLine("digite o nome do aluno:");
        nome_aluno = Console.ReadLine();

        for(i = 0; i < buscar_aluno.Length; i++)
        {

            if(buscar_aluno[i].nome == nome_aluno)
            {

                Console.WriteLine(buscar_aluno[i].nome);

                cont++;

            }
            else if (buscar_aluno[i].nome != nome_aluno && cont == 0)
            {

                Console.WriteLine("Aluno nao encontrado");

            }

        }

        Console.ReadKey();

        Console.Clear();

    }


}