#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main()
{
    setlocale(LC_ALL,"portuguese");

    int valor1,valor2;

    printf("digite dois valores:");
    scanf("%d%d",&valor1, &valor2);

    system("clear");

    if(valor1 > valor2)
    {
        printf("o valor %d é o maior valor digitado", valor1);
    }
    else
    {
        printf("o valor %d é o maior valor digitado", valor2);
    }

}