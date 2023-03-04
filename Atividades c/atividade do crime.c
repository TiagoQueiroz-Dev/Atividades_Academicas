#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main() {
  char resposta[5];
  int i,cont = 0;
  
  printf("voce telefonou para a vitima?\n");
  scanf("%s", &resposta[0]);
  
  printf("voce esteve no local do crime?\n");
  scanf("%s", &resposta[1]);
  
  printf("voce mora perto da vitima?\n");
  scanf("%s", &resposta[2]);
  
  printf("voce tinha dividas com a vitima?\n");
  scanf("%s", &resposta[3]);
  
  printf("voce ja trabalhou com a vitima?\n");
  scanf("%s", &resposta[4]);
  
  for(i = 0; i < 5; i++)
  {

  if(resposta[i] == 'S' || resposta[i] == 's')
  {

    cont++;
    
  }
    
  }

  switch(cont)
  {
    case 2:
    printf("voce é suspeito");
    break;

    case 3: case 4:
    printf("voce é cumplice");
    break;

    case 5:
    printf("voce é o assasino");
    break;

    default:
    printf("voce é inocente");
    break;
    
    
  }
  return 0;
}