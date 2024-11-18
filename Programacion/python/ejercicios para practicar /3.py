#Devuelve los caracteres en posiciones pares de un texto
text = str(input("Introduzca un texto: "))

for i in range(1, len(text)+1):
    if i % 2 == 0:
        print(text[i-1])