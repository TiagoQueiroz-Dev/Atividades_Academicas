package get_set;

public class oper {

    private int matricula, idade;
    private String nome, curso;
    int matricula1, idade1;
    String nome1, curso1;
    String impressao = "";

    public oper(int matricula, int idade, String nome, String curso){

        setCurso(curso);
        setNome(nome);
        setMatricula(matricula);
        setIdade(idade);

    }

    public void setNome(String nome){

        this.nome = nome;

    }
    public void setCurso(String curso){

        this.curso = curso;

    }
    public void setIdade(int idade){

        this.idade = idade;

    }
    public void setMatricula(int matricula){

        this.matricula = matricula;

    }
    public String getNome(){

        return nome;

    }
    public String getCurso(){

        return curso;

    }
    public int getMatricula(){

        return matricula;

    }
    public int getIdade(){

        return idade;

    }
    public String impressao(){

        nome1 = getNome();
        curso1 = getCurso();
        idade1 = getIdade();
        matricula1 = getMatricula();

        impressao = "nome: " + nome1 + "\nidade: " + idade1 + "\nmatricula: " + matricula1 + "\ncurso: " + curso1 + "\n";
        
        return impressao;
    }
    
}
