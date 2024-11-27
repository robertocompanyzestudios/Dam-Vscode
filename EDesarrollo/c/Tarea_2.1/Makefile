CFLAGS = -g -Wall
TARGET = programa
OBJETIVOS = calc_command.o calcular.o

programa: compilar_a compilar_b
	gcc $(CFLAGS) $(OBJETIVOS) -o $@

compilar_a: calc_command.c
	gcc -c $<

compilar_b: calcular.c
	gcc -c $<

.PHONY: limpiar borrartodo

clean:
	rm -f $(OBJETIVOS)

borrartodo:
	rm -f $(OBJETIVOS) $(TARGET)
