using System;

//Desenvolver um sistema para registrar avaliações de uma instituição
//Cadastre disciplinas, professores, alunos e avaliações contendo as associações esperadas.

class principal{
    static void Main(){
        Cadastros aux = new Cadastros();

        aux.Alunos();
        aux.Professor();
        aux.Disciplina();
        aux.Avaliacoes();

        Console.WriteLine(aux.avaliacao.Nome_Avaliacao);
        Console.WriteLine(aux.avaliacao.Disciplina);            
        Console.WriteLine(aux.avaliacao.Nota);
        Console.WriteLine(aux.avaliacao.Nome_Aluno);
        Console.WriteLine(aux.avaliacao.Serie);
        Console.WriteLine(aux.avaliacao.Professor);
    }
}

class Professores{
    //O professor com nome e título
    public string Nome { get; set; }
    public int Titulo { get; set; }
}
class Alunos{
    //o aluno será cadastrado com nome, série e matrícula
    public string Nome { get; set; }
    public int Serie { get; set; }
    public int Matricula { get; set; }
}
class Disciplinas{
    //disciplina com nome e carga horária
    public int Carga_Horaria { get; set; }
    public string Nome { get; set; }
}
class Avaliacoes{
    //As avaliações serão cadastradas com nota, série, nome da avaliação, o aluno que a realizou, professor que a desenvolveu e a disciplina
    public int Nota { get; set; }
    public int Serie { get; set; }
    public string Nome_Avaliacao { get; set; }
    public string Nome_Aluno { get; set; }
    public string Professor { get; set; }
    public string Disciplina { get; set; }
}
class Cadastros{
    public Alunos aluno = new Alunos();
    public Professores professor = new Professores();
    public Disciplinas disciplina = new Disciplinas();
    public Avaliacoes avaliacao = new Avaliacoes();
    public void Alunos(){
        Console.WriteLine("digite seu nome");
        aluno.Nome = Console.ReadLine();

        Console.WriteLine("Digite sua serie");
        aluno.Serie = int.Parse(Console.ReadLine());

        Console.WriteLine("digite sua matricula");
        aluno.Matricula = int.Parse(Console.ReadLine());
    }

    public void Professor(){
        Console.WriteLine("Digite seu nome");
        professor.Nome = Console.ReadLine();

        Console.WriteLine("digite seu Titulo");
        professor.Titulo = int.Parse(Console.ReadLine());
    }

    public void Disciplina(){
        Console.WriteLine("Qual a carga horaria da disciplina?");
        disciplina.Carga_Horaria = int.Parse(Console.ReadLine());

        Console.WriteLine("Qual o nome da disciplina?");
        disciplina.Nome = Console.ReadLine();
    }
    public void Avaliacoes(){
        avaliacao.Nome_Aluno = aluno.Nome;
        avaliacao.Professor = professor.Nome;
        avaliacao.Disciplina = disciplina.Nome;
        avaliacao.Serie = aluno.Serie;

        Console.WriteLine("Qual o nome da avaliaçao?");
        avaliacao.Nome_Avaliacao = Console.ReadLine();

        Console.WriteLine("Digite a nota da avaliaçao");
        avaliacao.Nota = int.Parse(Console.ReadLine());
    }

}