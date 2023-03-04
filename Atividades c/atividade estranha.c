#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <windows.h>
#include <string.h>

struct TPessoa
{
	
	int codigo,idade;
	char nome[50],sexo[50];
	float altura,peso;
	
};

int main()
{
	
	int i,op,tam,excluir_codigo,alterar_codigo,apenas_cadastro,j,cont,op2,novo_cadastro,aux = 0;
	
	setlocale(LC_ALL,"portuguese");
	
	printf("digite a quantidade de pessoas a serem cadastradas:\n");
	scanf("%d", &tam);
	
	struct TPessoa p[tam];
	
	for(i = 0; i < tam; i++){
		
		system("cls");
		
		printf("digite seu codigo:");
		scanf("%d", &p[i].codigo);
		
		fflush(stdin);
		printf("digite seu nome:");
		fgets( p[i].nome, 30,stdin);
		
		printf("digite sua idade:");
		scanf("%d", &p[i].idade);
		
		fflush(stdin);
		printf("digite seu sexo:");
		fgets(p[i].sexo,30,stdin);
		
		printf("digite seu peso:");
		scanf("%f", &p[i].peso);
		
		printf("digite sua altura:");
		scanf("%f", &p[i].altura);
		
		
	}
	op:
		
	system("cls");
	
	printf("1 - visualizar todos os cadastros\n2 - excluir cadastro\n3 - alterar informaçoes do cadastro\n4 - visualizar apenas um cadastro\n5 - novo cadastro\n6 - sair do programa");
	scanf("%d",&op);
	
	switch(op)
	{
		
		case 1:
			
			system("cls");
			
			if(novo_cadastro != tam && tam != aux && aux > 0)
			{
				tam++;
			}
			
			for(i = 0; i < tam; i++)
			{
				
				
				printf("\n");
				
				printf("codigo: %d\nnome: %sidade: %d\nsexo: %speso: %.2f\naltura: %.2f\n",p[i].codigo,p[i].nome,p[i].idade,p[i].sexo,p[i].peso,p[i].altura);
				
			}
			
			system("pause");
				
			goto op;
			
		break;
		
		case 2:
			
			inicio2:
				
			system("cls");
			
			printf("digite o codigo do cadastro:");
			scanf("%d",&excluir_codigo);
			
			for(i = 0; i < tam; i++)
			{
				
				if(p[i].codigo == excluir_codigo)
				{
					cont = i;
					
					for(j = cont; j < tam; j++)
					{
						
						p[cont].codigo = p[cont + 1].codigo;
						
						strcpy(p[cont].nome,p[cont + 1].nome);
						
						p[cont].idade = p[cont + 1].idade;
						
						strcpy(p[cont].sexo,p[cont + 1].sexo);
						
						p[cont].peso = p[cont + 1].peso;
						
						p[cont].altura = p[cont + 1].altura;
						
						cont++;
						
					}
					
					tam--;
			
					goto op;
					
				}
					
			}
			
			system("cls");
					
			printf("codigo digitado invalido... tente novamente");
					
			system("pause");
					
			goto inicio2;
			
		break;
		
		case 3:
			
			inicio3:
				
			system("cls");
			
			printf("alteraçao de dados do cadastro\n\n");
			
			printf("digite o codigo do cadastro que deseja alterar:\n");
			scanf("%d",&alterar_codigo);
			
			for(i = 0; i < tam; i++)
			{
				
				if(p[i].codigo == alterar_codigo)
				{
					op2:
					system("cls");
					printf("1 - alterar codigo\n2 - alterar nome\n3 - alterar idade\n4 - alterar sexo\n5 - alterar peso\n6 - alterar altura\n7 - alterar todas as informacoes\n8 - voltar\n");
					scanf("%d", &op2);
					
					switch(op2)
					{
						case 1:
							
							system("cls");
					
							printf("alteraçao do codigo do cadastro\n");
							
							printf("digite seu novo codigo:");
							scanf("%d", &p[i].codigo);
							
							goto op2;
							
						break;
						
						case 2:
							
							system("cls");
					
							printf("alteraçao do nome do cadastro\n");
							
							fflush(stdin);
							printf("digite seu novo nome:");
							fgets( p[i].nome, 30,stdin);
							
							goto op2;
							
						break;
						
						case 3:
							
							system("cls");
					
							printf("alteraçao da idade do cadastro\n");
							
							printf("digite sua nova idade:");
							scanf("%d", &p[i].idade);
							
							goto op2;
							
						break;
						
						case 4:
							
							system("cls");
					
							printf("alteraçao do sexo do cadastro\n");
							
							fflush(stdin);
							printf("digite seu novo sexo:");
							fgets(p[i].sexo,30,stdin);
							
							goto op2;
							
						break;
						
						case 5:
							system("cls");
					
							printf("alteraçao do peso do cadastro\n");
							
							printf("digite seu novo peso:");
							scanf("%f", &p[i].peso);
							
							goto op2;
							
						break;
						
						case 6:
							system("cls");
					
							printf("alteraçao da altura do cadastro\n");
							
							printf("digite sua nova altura:");
							scanf("%f", &p[i].altura);
							
							goto op2;
							
						break;
						
						case 7:
							system("cls");
					
							printf("alteraçao de dados do cadastro\n");
							
							printf("digite seu novo codigo:");
							scanf("%d", &p[i].codigo);
							
							fflush(stdin);
							printf("digite seu novo nome:");
							fgets( p[i].nome, 30,stdin);
							
							printf("digite sua nova idade:");
							scanf("%d", &p[i].idade);
							
							fflush(stdin);
							printf("digite seu novo sexo:");
							fgets(p[i].sexo,30,stdin);
							
							printf("digite seu novo peso:");
							scanf("%f", &p[i].peso);
							
							printf("digite sua nova altura:");
							scanf("%f", &p[i].altura);
							
							goto op2;
							
						break;
						
						case 8:
							
							goto op;
							
						break;
					}
				
				}
				
			}
			system("cls");
			
			printf("codigo digitado invalido\n");
			
			system("pause");
			
			goto inicio3;
		break;
		
		case 4:
			
			inicio4:
			
			printf("digite o codigo do cadastro que deseja ver\n");
			scanf("%d", &apenas_cadastro);
			
			for(i = 0; i < tam; i++)
			{
				
				if(p[i].codigo == apenas_cadastro)
				{
					
					system("cls");
					
					printf("codigo: %d\nnome: %sidade: %d\nsexo: %speso: %.2f\naltura: %.2f\n",p[i].codigo,p[i].nome,p[i].idade,p[i].sexo,p[i].peso,p[i].altura);
							
					system("pause");
							
					goto op;
							
				}
				
			}
			
			system("cls");
			
			printf("codigo digitado invalido\n");
					
			system("pause");
			
			goto inicio4;
			
		break;
		
		case 5:
			
			aux++;
			
			novo_cadastro = tam;
			
			system("cls");
			
			printf("novo cadastro\n");
		
			printf("digite seu codigo:");
			scanf("%d", &p[tam].codigo);
			
			fflush(stdin);
			printf("digite seu nome:");
			fgets( p[tam].nome, 30,stdin);
			
			printf("digite sua idade:");
			scanf("%d", &p[tam].idade);
			
			fflush(stdin);
			printf("digite seu sexo:");
			fgets(p[tam].sexo,30,stdin);
			
			printf("digite seu peso:");
			scanf("%f", &p[tam].peso);
			
			printf("digite sua altura:");
			scanf("%f", &p[tam].altura);
			
			goto op;
			
		break;
		
		case 6:
			
		break;
		
		default:
			
			system("cls");
			
			printf("opçao digitado invalido\n");
			
			system("pause");
			
			goto op;
			
		break;
			
	}
	
}