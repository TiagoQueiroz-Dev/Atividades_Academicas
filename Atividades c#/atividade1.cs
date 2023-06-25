using System;
class Program{
    /*
    static void Main(){
        int [,] nums = new int [4,4];
        int media=0;

         Console.WriteLine("Digite 16 numeros:");

        for(int g = 0;g<4;g++){
            for(int i = 0; i<4; i++){
                nums[g,i] = Convert.ToInt32(Console.ReadLine());
            }
        }
        Console.WriteLine("Os numeros que você digitou foram:");
        
        for(int m = 0; m<4 ; m++){
            for(int h = 0; h<4; h++){
                Console.Write(nums[m,h] + " ");
            }
            Console.WriteLine("");

        }
        Console.WriteLine("Numeros Pares:");
            for(int n = 0;n<4; n++){
                for(int b = 0;b<4; b++){

                    if(0 == nums[n,b] % 2){
                        Console.WriteLine(nums[n,b]);
                    }
                    
                }
            }
            Console.WriteLine("numeros impares:");
            for(int v = 0;v<4; v++){
                for(int c = 0;c<4; c++){

                    if(1 == nums[v,c] % 2){
                        Console.WriteLine( nums[v,c]);
                    }
                    
                }
            }
            for(int v = 0;v<4; v++){
                for(int c = 0;c<4; c++){
                    media += nums[v,c];
                }
            }
            media = media/16;
        Console.WriteLine("A media entre os valores digitados é:{0}", media);

    }
    */
    static void Main(){
        int a, b, c;

        Console.WriteLine("Digite 3 numeros:");
        a = Convert.ToInt32(Console.ReadLine());
        b = Convert.ToInt32(Console.ReadLine());
        c = Convert.ToInt32(Console.ReadLine());

        if(a == b && b == c && c == a){
            Console.WriteLine("Os numeros formam um triangulo equilatero");
        }
        if(b == c && c == a || a == b && c == a || a == b && b == c)
        {
            Console.WriteLine("Os numeros formam um triangulo isoceles");
        }
        if(a != b && b != c && c != a){
            Console.WriteLine("Os numeros formam um triangulo Escaleno");
        }
    }
}
    