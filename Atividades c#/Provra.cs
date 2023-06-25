// using System;
// class programa{
//     static void Main(){
//         double produto = 1.99;
//         Console.WriteLine("Loja de conveniências.");
//         Console.WriteLine("O que deseja comprar:");
//         for(int A = 0; A < 50; A++){
//             Console.WriteLine("Produto {0}-R${1}",A + 1,produto += 1.99 - 1.99);
//         }
//     }
// }

// using System;
// class Program{
//     static void Main(){
//         double prod = 1.99;

//         Console.WriteLine("Lojas Quase Dois");
//         Console.WriteLine("Tabela de preços");
        
//         for(int a = 0; a<51; a++){
//             Console.WriteLine("{0}- {1}", a, prod);
//             prod = prod+1.99;
//         }

//     }
// }

/*
using System;
class programa{
    static void Main(){
        double[] produto = new double[50];
        Console.WriteLine("Lojas Quase Dois - Tabela de preços");
        for(int A = 0; A < 50; A++){
            Console.WriteLine("Produto {0}-R${1}",A + 1,produto[A] += 1.99);
        }
    }
}
*/
using System;
class Program{
    static void Main(){
        float prod = 1.99F;
        Console.WriteLine("Loja Quase dois \n Tabela de preços:");
        
        for(int a = 1; a<51; a++){
            Console.WriteLine("Produto: {0} {1:c}", a, (prod*a));
        }
    }
}