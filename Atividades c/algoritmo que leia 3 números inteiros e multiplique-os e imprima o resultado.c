#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main()
{
    setlocale(LC_ALL,"portuguese");

    int valor1,valor2,valor3,resultado;

    printf("digite um valor:\n");
    scanf("%d%d%d",&valor1,&valor2,&valor3);

    resultado = valor1 + valor2 + valor3;

    system("clear");

    printf("a soma dos valores digitado foi: %d",resultado);

}