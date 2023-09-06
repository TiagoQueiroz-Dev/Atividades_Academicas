using System;
class Program{
    static void Main(){

        int[,] lista = new int[3,3];
        int numeroG = 0;
        int numeroP = 0;
        int numero = 0;

        Console.WriteLine("Digite 9 numeros:");
        for(int t = 0; t<3; t++){
            for(int i = 0; i < 3; i++){
                numero = lista[t,i];
                lista[t,i] = Convert.ToInt32(Console.ReadLine());
            }
        }
        Console.Clear();

        for(int t = 0; t<3; t++){
            for(int i = 0; i < 3; i++){
                
                if(lista[t,i] > numero){
                    numeroG = lista[t,i];
                }
                if(lista[t,i] < numero){
                    numeroP = lista[t,i];
                }
                
            }
        }

        Console.WriteLine("o maior numero é" + numeroG);
        Console.WriteLine("o menor numero é" + numeroP);
        
    }
}