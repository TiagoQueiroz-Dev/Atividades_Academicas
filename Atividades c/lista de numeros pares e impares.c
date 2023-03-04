#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main() 
{
  setlocale(LC_ALL,"portuguese");
  int tam = 20,i,valor[tam],par[tam],impar[tam],aux = 0,aux1 = 0;

  for(i = 0; i < tam;i++)
  {
    printf("digite um numero:");
    scanf("%d", &valor[i]);

    if(valor[i] % 2 == 0)
    {
      par[aux] = valor[i];
      aux++;
    }
    else
    {
      impar[aux1] = valor[i];
      aux1++;
    }
  }
  printf("numeros pares\n");
  for(i = 0; i < aux; i++)
  {
    if(par[i] % 2 == 0)
    {

      printf("%d\n",par[i]);
      
    }

    
  }
  printf("numeros impares\n");
  for(i = 0; i < aux1; i++)
  {
    
    if(impar[i] % 2 == 1)
    {

      printf("%d\n",impar[i]);
      
    }
    
  }
  
}