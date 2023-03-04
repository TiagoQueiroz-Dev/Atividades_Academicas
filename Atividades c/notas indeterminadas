#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main() 
{
  setlocale(LC_ALL,"portuguese");
  //i ja serve como quantidade de numeros digitados.
  int tam = 1,i,media,aux = 0;
  float soma = 0,notas[tam],aux1 = 0;
  char saida;

  for(i = 0;i < tam; i++)
  {
    system("cls");
    printf("digite um valor:\n");
    scanf("%f", &notas[i]);
    system("cls");
    printf("deseja digitar mais algum valor?[S/N]\n");
    scanf("%s", &saida);

    if(saida == 'S' || saida == 's')
    {

      tam++;
      
    }
    
    soma += notas[i];
    
  }
  
  media = soma / i;

  for(i = 0; i < tam; i++)
  {

    if(media < notas[i])
    {

      aux++;
      
    }
    
  }
  for(i = 0; i < tam; i++)
  {

    printf("%.1f\n",notas[i]);
    
  }
  printf("invetido\n");
  for(i = 0; i < tam/2; i++)
  {

    aux1 = notas[i];
    notas[i] = notas[tam-1];
    notas[tam-1] = aux1;
    
  }
   for(i = 0; i < tam; i++)
  {

    printf("%.1f\n",notas[i]);
    
  }

  printf("\n");
  
  printf("a quantidade de notas digitadas %d\na soma de todas as notas %.1f\na media de todas as notas: %d\na quantidade de ntas acima da media %d",i,soma,media,aux);