#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main() 
{
    setlocale(LC_ALL,"portuguese");
    int valor1,valor2,resultado;
    printf("digite dois valores:\n");
    scanf("%d%d",&valor1, &valor2);

    resultado = valor1 + valor2;

    printf("o resultado da soma entre %d e %d é:%d \n",valor1,valor2,resultado);
}