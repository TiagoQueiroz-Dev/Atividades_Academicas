using System;
class vetor{
    static void Main(){

        int[] num = new int[5];
        for (int n = 0; n < 5; n++)
        {
            Console.WriteLine("Digite 1000 numeros. "); 
            num[n] = int.Parse(Console.ReadLine()); 
            
        }
        Console.WriteLine("Voce digitou esses numeros:");
        for (int n = 0; n < 5; n++)
        {
            Console.WriteLine(num[n]);  
        }
    }
}