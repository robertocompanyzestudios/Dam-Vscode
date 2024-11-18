#Comprobación de años bisiestos Roberto Company Zomeño
date = int(input("Introduzca el año a comprobar: "))

if date % 4 == 0:
    print(f"El año {date} es bisiesto")
else:
    print(f"El año {date} no es bisiesto")