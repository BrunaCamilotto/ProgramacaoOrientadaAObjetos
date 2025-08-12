#include <stdio.h>

int main()
{
    float tempo, velocidade, distancia, litros;

    printf("8 - a| Insira o tempo gasto na viagem (horas): ");
    scanf("%f", &tempo);

    printf("8 - b| Insira a velocidade media (km/h): ");
    scanf("%f", &velocidade);

    distancia = tempo * velocidade;
    litros = distancia / 12;

    printf("Velocidade media: %.2f km/h\n", velocidade);
    printf("Tempo gasto: %.2f horas\n", tempo);
    printf("Distancia percorrida: %.2f km\n", distancia);
    printf("Litros utilizados: %.2f L\n", litros);

    return 0;
}
