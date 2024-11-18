#Roberto Company Zomeño
#Calculadora de numeros factoriales

def factorial(num):
    factorial = 1
    for i in range(1,num+1):
        factorial = factorial * i

    print(f"El factorial de {num} es {factorial}")

num1 = int(input("Introduzca el numeo del que desea obtener su factorial: "))

factorial(num1)