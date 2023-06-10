using System;
class aula6{
    static void Main(){
        int[] numeros = new int[20];
        int[] nPAR = new int[20];
        int[] nIMPAR = new int[20];

        for(int i = 0; i < numeros.Length; i++){
            Console.WriteLine("digite o {0} numero:", i+1);
            numeros[i] = int.Parse(Console.ReadLine());
        }
        for(int i = 0; i < numeros.Length; i++){
            if(numeros[i] % 2 == 0){
                nPAR[i] = numeros[i];
            }else{
                nIMPAR[i] = numeros[i];
            }
        }
        Console.WriteLine("Numeros Pares");
        for(int i = 0; i < nPAR.Length; i++){
            if(nPAR[i] != 0){
                Console.WriteLine(nPAR[i]);
            }
        }   
        Console.WriteLine("Numeros Impares");
        for(int i = 0; i < nIMPAR.Length; i++){
            if(nIMPAR[i] != 0){
                Console.WriteLine(nIMPAR[i]);   
            }
        }   
    }
}
