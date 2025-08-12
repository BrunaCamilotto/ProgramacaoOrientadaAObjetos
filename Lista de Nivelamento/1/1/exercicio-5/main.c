#include <stdio.h>
#include <string.h>

int main()
{
    char nome[50], sobrenome[50], nomeCompleto[100];

    printf("5 - a| Insira o nome: ");
    scanf("%s", nome);

    printf("5 - b| Insira o sobrenome: ");
    scanf("%s", sobrenome);

    strcpy(nomeCompleto, nome);
    strcat(nomeCompleto, " ");
    strcat(nomeCompleto, sobrenome);

    printf("O nome completo eh: %s\n", nomeCompleto);

    return 0;
}
