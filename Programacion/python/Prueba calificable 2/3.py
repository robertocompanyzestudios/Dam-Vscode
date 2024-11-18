mi_lista = [47, 64, 69, 37, 76, 83, 95, 97]
mi_diccionario = {'Antonio':47, 'Manuel':69, 'Ana':76, 'Aurora':97}

print(mi_diccionario.keys())
valores = mi_diccionario.values()
for i in mi_lista:
    if i not in valores:
        mi_lista.remove(i)

print(mi_lista)