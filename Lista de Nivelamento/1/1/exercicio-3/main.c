#include <stdio.h>

int main()
{
    float area, raio;
    const float pi = 3.14159;

    printf("3 - Insira o valor do raio: ");
    scanf("%f", &raio);

    area = pi * raio * raio;

    printf("A area da circunferencia eh: %.2f\n", area);

    return 0;
}
