using System;
class aula03{
    
    static void Main(){


        int soma, mult, div, sub,num1, num2;
        string  resp;

   Console.WriteLine("Digite dois numeros");
   num1 = int.Parse(Console.ReadLine());
   num2 = int.Parse(Console.ReadLine());

    Console.WriteLine("Qual operação?");
    resp = Console.ReadLine();

   switch(resp){

    case "soma":
   soma = num1 + num2;
    Console.WriteLine( " SOMA = " + soma );

    break;

     case "subtração" :
   sub = num1 - num2;
    Console.WriteLine( " SUBTRAÇÃO = " + sub );
    
    break;

     case "multiplicação" :
   mult = num1 * num2;
    Console.WriteLine( " MULTIPLICAÇÃO = " + mult );
    
    break;

     case "divisão" :
   div = num1 / num2;
    Console.WriteLine( " DIVISÃO = " + div );
    
    break;

   }


    }

}





/* num[0] = int.Parse(Console.ReadLine());
        num[1] = int.Parse(Console.ReadLine());
        num[2] = int.Parse(Console.ReadLine());
        num[3] = int.Parse(Console.ReadLine());
        num[4] = int.Parse(Console.ReadLine()); */

        /*int[] num = new int[5]; // VETOR

        for(int i = 0; i < 5; i++){ // COMANDO DE REPETIÇÃO
           
        Console.WriteLine("Digite 5 numeros:"); // IMPRIMIR NA TELA
        num[i] =int.Parse(Console.ReadLine());  // LER
        }

        for(int i = 0; i < 5; i++){

         Console.WriteLine(num[i]);

        }*/