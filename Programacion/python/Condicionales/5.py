#Calculadora Roberto Company Zomeño
num1 = int(input("Introduzca el primer numero a comparar: "))
num2 = int(input("Introduzca el segundo numero a comparar: "))
operacion = str.lower(input("Introduzca la operacion a realizar:\n (+)Suma\n(-)Resta\n(x)Multiplicacion\n(/)Division\n"))

if operacion == "+":
    print(f"{num1} + {num2} = {num1+num2}")
elif operacion == "-":
    print(f"{num1} - {num2} = {num1-num2}")
elif operacion == "x":
    print(f"{num1} x {num2} = {num1*num2}")
elif operacion == "/":
    print(f"{num1} / {num2} = {num1/num2}")
