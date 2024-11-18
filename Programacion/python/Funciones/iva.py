def calculoPrecio(cost, iva=21):

    finalCost = cost + (cost * iva/100)
    print(f"Precio sin IVA - - - {precio}")
    print(f"Precio final - - - - {finalCost}")
    return finalCost

precio = int(input("Introdzca el precio del producto: "))
iva = int(input("Introduzca el iva aplicado al producto(x%): "))
print(iva)
calculoPrecio(precio, iva)