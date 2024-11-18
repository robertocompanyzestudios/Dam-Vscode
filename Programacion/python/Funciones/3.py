#Roberto Company Zomeño
#Calcular el área de un círculo y el volumen de un cilindro
print("Bienvenido al programa de cálculo de areas y vólumenes")

def areaCirculo(radiodef):
    areadef = (radiodef*radiodef) * 2.14
    return(areadef)

def volcilindro(alturadef, radiodef):
    areadef = areaCirculo(radiodef)
    vol = areadef * alturadef
    return(vol)

print("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -")
#Circulo
radio = float(input("Introduzca el radio del círculo(cm): "))
area = areaCirculo(radio)
print(f"El area del circulo es de {area}cm")

print("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -")
#Cilindro
radioCilindro = float(input("Introduzca el radio de la base del cilindro(cm): "))
altura = float(input("Introduzca el altura del cilíndro(cm): "))

volumen = volcilindro(altura, radioCilindro)
print(f"El volumen del cilindro es de {volumen}cm cubicos")

