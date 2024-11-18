#Comprobacion IMC Roberto Company Zomeño
peso = float(input("Introduzca su peso(kg): "))
altura = float(input("Introduzca su altura(m): "))

imc = peso / (altura*altura)
print(f"Su IMC es {round(imc, 2)}")