#include <stdio.h>
int main() {
     double base, altura, area;
     
     printf("Introduzca la base del rectángulo:\n");
     scanf("%lf", &base);
    while(base <= 0) {
           printf("Por favor, introduzca un número positivo para la base:\n");
           scanf("%lf", &base);
         }
    printf("Introduzca la altura del rectángulo:\n");
    scanf("%lf", &altura);
    while(altura <= 0) {
            printf("Por favor, introduzca un número positivo para la altura:\n");
             scanf("%lf", &altura);
       }
    area = base * altura
    printf("El área del rectángulo es: %lf\n", area
     return 0;
}
