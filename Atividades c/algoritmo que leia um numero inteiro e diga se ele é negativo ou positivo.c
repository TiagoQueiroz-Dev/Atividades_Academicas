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

    if(valor1 > 0)
    {
        printf("o valor %d é positivo", valor1);
    }
    else
    {
        printf("o valor %d é negativo", valor1);
    }

}