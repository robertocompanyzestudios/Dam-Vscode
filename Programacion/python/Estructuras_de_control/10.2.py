import random
lista = []
for i in range(0,101):
    lista.append(i)
print(lista)

random.shuffle(lista)
print(lista[1])