num = int(input("Calcular el producto de todos los numeros desde el 1 hasta: "))
print("-----------------")

total = 1
for i in range (1, num +1):
    total = total * i
    print(f"El producto es = {total}")