#suma de datos
lista = [14, 634, 123, 10, 5, 30, 153, 350]

for i in range(1, len(lista)):
    suma = lista[i] + lista[i-1]
    print(f"{lista[i]} + {lista[i-1]} = {suma}")