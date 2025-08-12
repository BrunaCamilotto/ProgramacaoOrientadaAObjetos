#include <stdio.h>

int main()
{
    float comprimento, largura, altura, volume;

    printf("10 - a| Insira o comprimento: ");
    scanf("%f", &comprimento);

    printf("10 - b| Insira a largura: ");
    scanf("%f", &largura);

    printf("10 - c| Insira a altura: ");
    scanf("%f", &altura);

    volume = comprimento * largura * altura;

    printf("O volume da caixa retangular e: %.2f\n", volume);

    return 0;
}
