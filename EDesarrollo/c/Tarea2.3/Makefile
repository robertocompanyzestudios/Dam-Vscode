CFLAGS = -g -Wall
TARGET-ESTANDAR = calc_command
TARGET-INTERACTIVE = calc_interactive
TARGETS = $(TARGET-ESTANDAR) $(TARGET-INTERACTIVE)
OBJETIVOS-ESTANDAR = calc_command.o calcular.o
OBJETIVOS-INTERACTIVE = calc_interactive.o  calcular.o
OBJETIVOS = $(OBJETIVOS-ESTANDAR) $(OBJETIVOS-INTERACTIVE)

COMP = gcc # compilador - opciones: gcc / cc


all: compilar_a compilar_b compilar_c
	$(COMP) $(CFLAGS) $(OBJETIVOS-ESTANDAR) -o $(TARGET-ESTANDAR)
	$(COMP) $(CFLAGS) $(OBJETIVOS-INTERACTIVE) -o $(TARGET-INTERACTIVE)

calc_command: compilar_a compilar_b
	$(COMP) $(CFLAGS) $(OBJETIVOS-ESTANDAR) -o $(TARGET-ESTANDAR)

calc_interactive: compilar_a compilar_c
	$(COMP) $(CFLAGS) $(OBJETIVOS-INTERACTIVE) -o $(TARGET-INTERACTIVE)

compilar_a: calcular.c
	$(COMP) -c $<

compilar_b: calc_command.c
	$(COMP) -c $<

compilar_c: calc_interactive.c
	$(COMP) -c $<


.PHONY: clean borrartodo

clean:
	rm -f $(OBJETIVOS)

borrartodo:
	rm -f $(OBJETIVOS) $(TARGETS)