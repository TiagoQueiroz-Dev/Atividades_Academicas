#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main()
{
    setlocale(LC_ALL,"portuguese");

    int valor1,valor2,resultado;

    printf("digite dois valores:");
    scanf("%d%d",&valor1, &valor2);

    system("clear");

    resultado = valor1 + valor2;

    if(resultado % 2 == 0)
    {
        printf("o valor %d é par", resultado);
    }
    else
    {
        printf("o valor %d é impar", resultado);
    }

}