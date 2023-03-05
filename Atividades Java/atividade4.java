import java.util.Scanner;

public class atividade4 
{

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int valor1,valor2,result;

        System.out.println("Digite dois numeros:");
        valor1 = scan.nextInt();
        valor2 = scan.nextInt();

        result = valor1 + valor2;

        System.out.println("A soma dos valores digitados: " + result);
        
    }

}
