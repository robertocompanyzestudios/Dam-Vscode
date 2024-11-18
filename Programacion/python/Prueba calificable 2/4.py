mi_lista = [87, 94, 45, 41, 65, 94, 41, 99, 94]

mi_lista = list(dict.fromkeys(mi_lista))
tupla = tuple(mi_lista)

max = 0
min = 10000

for i in mi_lista:
    if i > max:
        max = i
    elif i < min:
        min = i

print(f"Elementos únicos: {mi_lista} Tupla: {tupla} Menor={min} Mayor={max}")