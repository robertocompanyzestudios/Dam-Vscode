#include <stdio.h>

int main() {
    printf("Inicio del programa\n");

    int numeros[10];
    int i;
    int j;
    int x;
    int auxiliar;

    for(i=0;i < 10; i++) {
        printf("Introduce el %dº numero: ", (i+1));
        scanf("%d", &numeros[i]);
    }
    printf("Lista ordenada\n");
    for(i=0;i<10;i++) {
        for(j=i+1;j<10;j++){
            if(numeros[j]<numeros[i]){
                auxiliar = numeros[i];
                numeros[i]= numeros[j];
                numeros[j] = auxiliar;
            }
        }
        for (int x = 0; x < 10; x++) {
                printf("%d ", numeros[x]);
            }
            printf("\n");
    }

    printf("\n Fin del programa\n");
    return 0;
}
