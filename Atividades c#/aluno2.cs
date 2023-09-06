using System;

class aula1
{
   static void Main()
   {
      int result;
      
      Console.WriteLine("Digite um valor entre 1 e 7:");
      result = int.Parse(Console.ReadLine());

      if(result == 1)
      {
         Console.WriteLine("Domingo");
      }
      else if(result == 2)
      {
         Console.WriteLine("Segunda-feira");
      }

      else if(result == 3)
      {
         Console.WriteLine("Terça-feira");
      }

      else if(result == 4)
      {
         Console.WriteLine("Quarta-feira");
      }

      else if(result == 5)
      {
         Console.WriteLine("Quinta-feira");
      }

      else if(result == 6)
      {
         Console.WriteLine("Sexta-feira");
      }

      else if(result == 7)
      {
         Console.WriteLine("Sábado");
      }

      else
      {
         Console.WriteLine("Digite APENAS valores entre 1 e 7");
      }
   }
}
