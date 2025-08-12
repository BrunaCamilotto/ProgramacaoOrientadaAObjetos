#include <stdio.h>

int main()
{
    int numero1, numero2, soma;

    printf("6 - a| Insira o primeiro numero: ");
    scanf("%d", &numero1);

    printf("6 - b| Insira o segundo numero: ");
    scanf("%d", &numero2);

    soma = numero1 + numero2;

    printf("O resultado da soma eh: %d\n", soma);

    return 0;
}
