
def num10():

    lista1 = []
    longitud = len(lista1)

    #Pide datos por consola hasta que la lista tenga 10
    while longitud < 9:

        #Analiza la longitud de la lista
        longitud = len(lista1)
        print(f"Tenemos {longitud}/10 números")

        #Pide un numero por teclado, lo almacena como int y lo añade a la lista
        num = int(input("Introduzca un número: "))
        lista1.append(num)

    #Lista sin ordenar
    #print(f"lista = {lista1}")

    #Lista ordenada
    lista1.sort()
    print(f"Valores ordenados = {lista1}")

    eleccion = 1
    #Hasta que el usuario no elija 1 o 0(repetir o finalizar), continua el bucle
    while eleccion:
        repetir = int(input("¿Desea volver a ejecutar el programa?: \n (1)--Si \n (0)--No \n"))

        if repetir == 1:
            eleccion = 0
            num10()
        elif repetir == 0:
            eleccion = 0
            print("Saliendo del programa...")
        else:
            print("Numero incorrecto")

num10()


