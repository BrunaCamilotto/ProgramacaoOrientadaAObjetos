#include <stdio.h>
#include <math.h>

int main()
{
    float base, expoente, resultado;

    printf("4 - a| Insira o valor da base: ");
    scanf("%f", &base);

    printf("4 - b| Insira o valor do expoente: ");
    scanf("%f", &expoente);

    resultado = powf(base, expoente);

    printf("O resultado eh: %.2f\n", resultado);

    return 0;
}
