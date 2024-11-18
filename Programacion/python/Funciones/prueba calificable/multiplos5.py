#comprueba los multiplos de 100 de una lista y los mete en otra lista

lista = [14, 634, 123, 10, 5, 30, 153, 350]
multiplos = []
for i in lista:
    if i > 1500:
        continue
    elif i > 500:
        break
    else:
        if i % 5 == 0:
            multiplos.append(i)

print(multiplos)