#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main()
{
    setlocale(LC_ALL,"portuguese");

    int valor;

    printf("digite um valor:");
    scanf("%d",&valor);

    system("clear");

    printf("valor digitado foi: %d",valor);

}