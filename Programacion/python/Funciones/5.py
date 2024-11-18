#Roberto Company Zomeño
#Calculadora de cuadrados
print("bienvenido al programa de calculo de cuadrados")
cantidad = int(input("¿Cuantos numeros tiene su lista?: "))

#muestra de datos a calcular
lista = []
for i in range(0, cantidad):
    num = float(input(f"Introduzca el {i+1}º numero a calcular: "))
    lista.append(num)

for i in range(0, len(lista)):
    lista[i] = (lista[i])**2

print(lista)