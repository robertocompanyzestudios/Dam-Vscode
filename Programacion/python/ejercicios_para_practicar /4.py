#Solicita un texto y un entero, borra n caracteres y lo imprime
text = str(input("Introduzca el texto: "))
print("Se borraran n caracteres del texto, introduzca n")
n = (int(input("n = ")))

text = text[n:]
print(text)