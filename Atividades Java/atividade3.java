import java.util.Scanner;

public class atividade3 
{
    
    public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);
        String nome;
        int salario;

        System.out.println("digite seu nome:");
        nome = scan.nextLine();

        System.out.println("digite seu salario:");
        salario = scan.nextInt();

        System.out.println("Seu nome: " + nome + "\nSeu salario: " + salario);




    }

}
