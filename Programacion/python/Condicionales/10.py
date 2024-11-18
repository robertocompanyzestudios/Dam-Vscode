#Calculadora de descuentos Roberto Company Zomeño
precio = float(input("Introduzca el precio del producto: "))
descuento = float(input("Introduzca el descuento del producto: "))

precio_final = round(precio / 100 * (100 - descuento), 2)
print(f"El precio final es {precio_final}€")