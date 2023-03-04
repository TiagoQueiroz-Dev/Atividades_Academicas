#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <windows.h>

int main ()
{
	
	setlocale(LC_ALL, "portuguese");
	
	int teste = 0;
	int victory = 0, roda;
	int i, j, buscaI, buscaJ,aux = 0, op; 
	char mat[3][3];
	
	mat[0][0] = ' ';
	mat[0][1] = ' ';
	mat[0][2] = ' ';
	mat[1][0] = ' ';
	mat[1][1] = ' ';
	mat[1][2] = ' ';
	mat[2][0] = ' ';
	mat[2][1] = ' ';
	mat[2][2] = ' ';
	
	roda = 0;
	
	while(roda <= 9)
	{
	
	inicio:
	
	system("cls");
	
	printf("\n %c | %c | %c \n --------- \n %c | %c | %c \n --------- \n %c | %c | %c \n\n", mat[0][0], mat[0][1], mat[0][2], mat[1][0], mat[1][1], mat[1][2], mat[2][0], mat[2][1], mat[2][2]);
	
	if(roda % 2 == 0)
	{
		
		printf("vez do jogador 1\n");
		
	}
	else
	{
		
		printf("vez do jogador 2\n");
		
	}

	printf("\nDigite a a linha onde deseja jogar:");
	scanf("%d", &buscaI);
	
	printf("Digite a coluna onde deseja jogar:");
	scanf("%d", &buscaJ);
	
	if(buscaJ > 0 && buscaJ <= 3 && buscaI > 0 && buscaI <= 3)
	{
	
		if(roda % 2 == 0)
		{
			
				for(j = -1; j < 3; j++)
				{
					
					if(i == buscaI-1 && j == buscaJ-1)
					{
						
						if(mat[i][j] == ' ')
						{
						
							mat[i][j] = 'x';
							
						}
						else
						{
							
							system("cls");
							
							printf("opçao ja escolhida");
							
							Sleep (2000);
							
							goto inicio;
						}
						
					}
					
				}
				
		}
		
		else
		
		{
			
			for(i = -1; i < 3; i++)
			{
				
				for(j = -1; j < 3; j++)
				{
					
					if(i == buscaI-1 && j == buscaJ-1)
					{
						
						if(mat[i][j] == ' ')
						{
						
							mat[i][j] = 'o';
							
						}
						
						else
						
						{
							
							system("cls");
							
							printf("opçao ja escolhida");
							
							Sleep (2000);
							
							goto inicio;
							
						}
						
					}
					
				}
				
			}
			
		}
		
	}
	
	else
	
	{
		
		system("cls");
		
		printf("linha ou codigo invalido");
		
		Sleep (2000);
		
		goto inicio;
		
	}
	
	roda++;
			
	if(roda >= 5)
	{
				
		if(mat[0][0] == mat[0][1] && mat[0][0] == mat[0][2] && mat[0][0] != ' ')
		{
				
			break;
					
		}

		else if(mat[1][0] == mat[1][1] && mat[1][0] == mat[1][2] && mat[1][0] != ' ')
		{
					
			break;
					
		}

		else if(mat[2][0] == mat[2][1] && mat[2][0] == mat[2][2] && mat[2][0] != ' ')
		{
					
			break;
					
		}

		else if(mat[0][0] == mat[1][0] && mat[0][0] == mat[2][0] && mat[0][0] != ' ')
		{
		
			break;
					
		}

		else if(mat[0][1] == mat[1][1] && mat[0][1] == mat[2][1] && mat[0][1] != ' ')
		{
					
			break;
					
		}

		else if(mat[0][2] == mat[1][2] && mat[0][2] == mat[2][2] && mat[0][2] != ' ')
		{
					
			break;
					
		}
	
		else if(mat[0][0] == mat[1][1] && mat[0][0] == mat[2][2] && mat[0][0] != ' ')
		{
					
			break;
					
		}
	
		else if(mat[0][2] == mat[1][1] && mat[0][2] == mat[2][0] && mat[0][2] != ' ')
		{
					
			break;
					
		}

		else if(roda == 9)
		{
					
			aux++;
					
			break;
					
		}		
	}
					
	}

	if(roda % 2 == 0 && aux == 0)
	{
		
		system("cls");
	
		printf("\n %c | %c | %c \n --------- \n %c | %c | %c \n --------- \n %c | %c | %c \n", mat[0][0], mat[0][1], mat[0][2], mat[1][0], mat[1][1], mat[1][2], mat[2][0], mat[2][1], mat[2][2]);
		
		printf("O jogador 2 venceu!!");
		
		}
		
		else if(roda % 2 == 1 && aux == 0)
		{
		
		system("cls");
	
		printf("\n %c | %c | %c \n --------- \n %c | %c | %c \n --------- \n %c | %c | %c \n", mat[0][0], mat[0][1], mat[0][2], mat[1][0], mat[1][1], mat[1][2], mat[2][0], mat[2][1], mat[2][2]);
		
		printf("O jogador 1 venceu!!");
			
	}
	
	else
	{
		
		system("cls");
	
		printf("\n %c | %c | %c \n --------- \n %c | %c | %c \n --------- \n %c | %c | %c \n", mat[0][0], mat[0][1], mat[0][2], mat[1][0], mat[1][1], mat[1][2], mat[2][0], mat[2][1], mat[2][2]);
		
		printf("o jogo deu velha");
		
	}
	
}