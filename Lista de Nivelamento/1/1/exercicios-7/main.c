#include <stdio.h>

int main()
{
    float celsius, fahrenheit;

    printf("7 - Insira a temperatura em graus Celsius: ");
    scanf("%f", &celsius);

    fahrenheit = (9 * celsius + 160) / 5;

    printf("A temperatura em graus Fahrenheit eh: %.2f\n", fahrenheit);

    return 0;
}
