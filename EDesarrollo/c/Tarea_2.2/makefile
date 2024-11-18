CFLAGS = -g -Wall
TARGET = programa
OBJETIVOS = entrada.o factorial.o imprime.o main.o

programa: compilar_a compilar_b compilar_c compilar_d
	gcc $(CFLAGS) $(OBJETIVOS) -o $(TARGET)

compilar_a: entrada.c
	gcc -c $<

compilar_b: factorial.c
	gcc -c $<

compilar_c: imprime.c
	gcc -c $<

compilar_d: main.c
	gcc -c $<

.PHONY: clean borrartodo

clean:
	rm -f $(OBJETIVOS)

borrartodo:
	rm -f $(OBJETIVOS) $(TARGET)