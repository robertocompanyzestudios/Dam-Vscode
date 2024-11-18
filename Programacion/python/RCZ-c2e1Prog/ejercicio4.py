#Roberto Company Zomeño
#Crea una piramide de 6 escalones de alto

#Mitad superior hasta centro
for i in range(1,7):
    for j in range(1,i+1):
        print(f"{j} ", end="")
    print()
#Mitad inferior(centro no incluido)
for i in range(5,0, -1):
    for j in range(1,i+1):
        print(f"{i} ", end="")
    print()