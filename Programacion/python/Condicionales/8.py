#Comprobacion dias del mes Roberto Company Zomeño
meses = {
    1 : "Enero",
    2 : "Febrero",
    3 : "Marzo",
    4 : "Abril",
    5 : "Mayo",
    6 : "Junio",
    7 : "Julio",
    8 : "Agosto",
    9 : "Septiembre",
    10 : "Octubre",
    11 : "Noviembre",
    12 : "Diciembre",
}

dias = {
    1 : 31,
    2 : 28,
    3 : 31,
    4 : 30,
    5 : 31,
    6 : 30,
    7 : 30,
    8 : 31,
    9 : 30,
    10 : 31,
    11 : 30,
    12 : 31,
}

eleccion = int(input("Introduzca el numero del mes a comprobar: "))

print(f"El mes de {meses[eleccion]} tiene {dias[eleccion]} dias")