#include <stdio.h>
#include <string.h>

int main(){
    char texto[100000];

    printf("Introduce un texto: ");
    fgets(texto, 100000, stdin);
    printf("El texto es: %s", texto);

    int i;
    int wordcount;
    wordcount = 1;
    for(i= 0; texto[i] != '\0';  i++){
        if(texto[i]==' '){
            wordcount++;
        }
    }
    printf("Hay %d palabras \n", wordcount);

    for(i= 0; texto[i] != '\0';  i++){
        if(texto[i]==' '){
            printf("\n");
        } else {
            printf("%c", texto[i]);
        }
    }


    return 0;
}