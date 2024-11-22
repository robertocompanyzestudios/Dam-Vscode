mi_lista = [87, 94, 45, 41, 65, 94, 41, 99, 94]

def borrar(lista):
    posicion = 0
    for i in lista:
        print(f"i = {i}")
        for j in lista[1:]:
            print(f"j = {j}")
            if i == j:
                while i in lista:
                    mi_lista.remove(i)
                    print(lista)
                    return True

        print(f"posicion = {posicion}")
        if posicion == len(lista)-1:
            return False
        else:
            posicion = posicion + 1

        borrar(lista)

borrar(mi_lista)



#mi_lista = list(dict.fromkeys(mi_lista))
tupla = tuple(mi_lista)

max = 0
min = 10000

for i in mi_lista:
    if i > max:
        max = i
    elif i < min:
        min = i

print(f"Elementos únicos: {mi_lista} Tupla: {tupla} Menor={min} Mayor={max}")