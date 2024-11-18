#Calcula el iva de una lista de productos
productosIva = {}
productosPrecio = {}
cantidad = int(input("¿Cuántos productos desea comprobar?: "))

#Almacena en 2 diccionarios los cada producto con su precio e iva en el siguiente formato:
#Nombre : precio
#Nombre : IVA
for i in range(1,cantidad + 1):
    producto = str(input(f"Introduzca el nombre del {i}º producto: "))
    precio = int(input(f"Introduzca el precio de {producto}: "))
    impuesto = int(input(f"Introduzca el impuesto aplicado a {producto}(%): "))
    productosIva[producto] = impuesto
    productosPrecio[producto] = precio


total = 0
#Calcula el precio final de cada producto y lo suma a la variable total
#Toma como parametro cost e iva
def calculoPrecio(cost, iva=21,):
    #global para que actualice su valor fuera del ambito de la funcion
    global total
    print(i)
    finalCost = cost + (cost * iva/100)
    print(f"Precio sin IVA - - - {productosPrecio[i]}")#cambiar por el diccionario
    print(f"Precio final - - - - {finalCost}")
    total = total + finalCost
    return total

#Recorre todos los productos del diccionario
for i in productosIva:
    coste = calculoPrecio(productosPrecio[i], productosIva[i])
print(coste)
