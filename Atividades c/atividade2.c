#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main(){
    char nome[10];
    printf("digite seu nome\n");
    scanf("%s", &nome);
    printf("ola %s, é m prazer te conhecer", nome);
}