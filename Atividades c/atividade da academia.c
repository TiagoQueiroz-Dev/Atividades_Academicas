#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main() 
{
  setlocale(LC_ALL,"portuguese");
  
  int tam = 1,i;
  float altura[tam],peso[tam],auxa,aux1a,auxp,aux1p,codigo[tam],auxc,aux1c,amax,amin,pmax,pmin;

  for(i = 0;i < tam; i++)
  {
    
    system("cls");
    printf("digite seu codigo:\n");
    scanf("%f", &codigo[i]);
    if(codigo[i] == 0)
    {

      break;
      
    }
    printf("digite seu peso:\n");
    scanf("%f", &peso[i]);
    printf("digite sua altura:\n");
    scanf("%f", &altura[i]);
    system("cls");
    tam++;
    
  }
  
  auxa = altura[1];
  auxp = peso[1];
  
  for(i = 0; i < tam; i++)
  {
    
    if(altura[i] > auxa)
    {
      auxa = altura[i];
      amax = i;
    }
    else
    {
      aux1a = altura[i];
      amin = i;
    }
    if(peso[i] > auxc)
    {
      auxp = peso[i];
      pmax = i;
    }
    else
    {
      aux1p = peso[i];
      pmin = i;
    }
    
  }

  printf("maior altura: %.2f\tmenor altura: %.2f\nmaior peso: %.2f\tmenor peso: %.2f\n",auxa,aux1a,auxp,aux1p);

}