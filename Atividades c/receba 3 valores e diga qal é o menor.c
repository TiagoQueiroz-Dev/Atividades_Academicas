#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main()
{
    setlocale(LC_ALL,"portuguese");

    int vetor[3],i,aux;

    for(i = 0; i < 3; i++)
    {

        printf("digite um valor:");
        scanf("%d",&vetor[i]);

    }

    aux = vetor[2];

    for(i = 0; i < 3; i++)
    {

        if(vetor[i] < aux)
        {

            aux = vetor[i];

        }

    }

    system("clear");

    printf("o menor valor digitado foi: %d",aux);

}