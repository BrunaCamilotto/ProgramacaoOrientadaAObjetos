#include <stdio.h>

int main()
{
    float distancia, combustivel, consumo;

    printf("9 - a| Insira a distancia total percorrida (km): ");
    scanf("%f", &distancia);

    printf("9 - b| Insira o total de combustivel gasto (litros): ");
    scanf("%f", &combustivel);

    consumo = distancia / combustivel;

    printf("O consumo medio e: %.2f km/l\n", consumo);

    return 0;
}
