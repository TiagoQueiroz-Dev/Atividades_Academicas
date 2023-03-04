#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main()
{
    setlocale(LC_ALL,"portuguese");

    int valor1, valor2, valor3, media;

    printf("digite 3 valores para retirar a media:");
    scanf("%d%d%d",&valor1,&valor2,&valor3);

    media = (valor1 + valor2 + valor3)/3;

    printf("a media dos valores digitados foi igual a: %d", media);

}