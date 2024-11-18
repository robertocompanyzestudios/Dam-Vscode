#Comprobacion de notas Roberto Company Zomeño
nota = int(input("Introduzca la nota a comprobar: "))

if nota >= 0 and nota < 5:
    print("Su nota es insuficiente")
elif nota >= 5 and nota < 7:
    print("Su nota es suficiente")
elif nota >= 7 and nota < 9:
    print("Su nota es notable")
elif nota >= 9 and nota < 10:
    print("Su nota es sobresaliente")
else:
    print("El dato introducido está fuera de rango")