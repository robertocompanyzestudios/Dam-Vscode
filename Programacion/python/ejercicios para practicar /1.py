#si el producto de ambos numeros es mayor que 1000 saca el producto, de otro modo saca la suma
num1 = float(input("Introduzca el primer numero: "))
num2 = float(input("Introduzca el segundo numero: "))

producto = num1 * num2
suma = num1 + num2

if producto > 1000:
    print(producto)
else:
    print(suma)