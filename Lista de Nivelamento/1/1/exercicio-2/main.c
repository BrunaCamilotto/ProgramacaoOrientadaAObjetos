#include <stdio.h>


int main()
{
    float primeiraNota, segundaNota, terceiraNota, quartaNota, media;

    printf("2 - a| Insira a primeira nota: ");
    scanf("%f", &primeiraNota);

    printf("2 - b| Insira a segunda nota: ");
    scanf("%f", &segundaNota);

    printf("2 - c| Insira a terceira nota: ");
    scanf("%f", &terceiraNota);

    printf("2 - d| Insira a quarta nota: ");
    scanf("%f", &quartaNota);

    media = (primeiraNota + segundaNota + terceiraNota + quartaNota) / 4;

    printf("A media eh: %.2f\n", media);


    return 0;
}
