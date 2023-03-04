#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main() 
{
  setlocale(LC_ALL,"portuguese");

  int n1,n2;

  printf("digite dois valores:\n");
  scanf("%d%d", &n1,&n2);

  system("clear");
  
  if(n1 > n2)
  {
    printf("1º - %d\n2º - %d",n2,n1);
  }
  else
  {
   printf("1º - %d\n2º - %d",n1,n2);
  }
  
}