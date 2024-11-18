#Roberto Company Zomeño
#Programa de calculo de media, varianza y desviacion tipica
import math

datos = {}
print("bienvenido al programa de calculo de media, varianza y desviacion tipica")
cantidad = int(input("¿Cuantos numeros tiene su lista?: "))

#muestra de datos a calcular
lista = []
for i in range(0, cantidad):
    num = float(input(f"Introduzca el {i+1}º numero a comparar: "))
    lista.append(num)

def calculadora(lista):
    #media
    total = 0
    for i in lista:
     total = total + i
    media = total / len(lista)
    datos["media"] = media

    #varianza
    total = 0
    for i in lista:
        #calcula el numero absoluto de la distancia entre i y la media
        distancia = i - media
        distancia = distancia * distancia
        total = total + distancia
    varianza = round(total /(len(lista)), 2)
    datos["varianza"] = varianza

    #desviacion tipica
    desviacion = round(math.sqrt(varianza), 2)
    datos["desviacion"] = desviacion

    return datos

salida = calculadora(lista)
print(salida)