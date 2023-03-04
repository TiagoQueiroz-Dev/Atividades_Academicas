#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main()
{
    setlocale(LC_ALL,"portuguese");

    int valor1;

    printf("digite um valor:");
    scanf("%d",&valor1);

    system("clear");

    if(valor1 > 10)
    {
        printf("o valor %d é maior que 10", valor1);
    }
    else
    {
        printf("o valor %d é menor ou igual a 10", valor1);
    }

}