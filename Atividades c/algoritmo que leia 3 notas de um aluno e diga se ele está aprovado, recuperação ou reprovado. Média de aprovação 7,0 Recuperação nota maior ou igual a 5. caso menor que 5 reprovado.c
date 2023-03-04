#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main() 
{
  setlocale(LC_ALL,"portuguese");
  
  float n1,n2,n3,media;
  
  printf("digite as tres notas do aluno:\n");
  scanf("%f%f%f", &n1,&n2,&n3);
  
  media = (n1 + n2 + n3)/3;

  system("clear");
    
  if(media >= 7)
  {
    printf("voce foi APROVADO com media %.1f\n",media);
  }
  else if(media >= 5)
  {
    printf("voce foi para RECUPERAÇÃO com media %.1f\n",media);
  }
  else
  {
    printf("voce foi REPROVADO com media %.1f\n",media);
  }
  
}