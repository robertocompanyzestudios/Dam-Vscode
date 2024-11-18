#Roberto Company Zomeño
#Calcula el IVA de cada producto y saca una factura
productos = []
cantidad = int(input("¿Cuántos productos desea comprobar?: "))

#Almacena todos los datos en una matriz con formmato:
#[Nombre, precio, impuesto]
for i in range(0,cantidad ):
    nombre = str(input(f"Introduzca el nombre del {i + 1}º producto: "))
    precio = int(input(f"Introduzca el precio de {nombre}: "))
    impuesto = (input(f"Introduzca el impuesto aplicado a {nombre}(%): "))
    productos.append([nombre, precio, impuesto])
#print(productos)

total = 0
#Calcula el precio final de cada producto y lo suma a la variable total
#Toma como parametro cost e iva(no necesario)
def calculoPrecio(cost, iva=21,):
    #global para que actualice su valor fuera del ambito de la funcion
    global total
    print(productos[i][0])
    finalCost = cost + (cost * iva/100)
    print(f"Precio sin IVA - - - {productos[i][1]}")#cambiar por el diccionario
    print(f"Precio final - - - - {finalCost}")
    total = total + finalCost
    return total

#Recorre todos los productos de la matriz
for i in range(0 , len(productos)):
    if productos[i][2] == '':
        coste = calculoPrecio(productos[i][1])
    else:
        coste = calculoPrecio(productos[i][1], int(productos[i][2]))

print(coste)
