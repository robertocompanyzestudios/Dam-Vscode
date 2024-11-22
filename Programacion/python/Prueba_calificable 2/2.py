
list = []
for i in range(0,9):
    num = int(input(f"Introduce el {i+1} numero de la lista: "))
    list.append(num)

list1 = []
list2 = []
list3 = []
for i in range(0,9):
    if i == 0:
        list1.append(list[i])
        list1.append(list[i+1])
        list1.append(list[i+2])
    elif i == 3:
        list2.append(list[i])
        list2.append(list[i+1])
        list2.append(list[i+2])
    elif i == 6:
        list3.append(list[i])
        list3.append(list[i+1])
        list3.append(list[i+2])
print(list1, list2, list3)

list1.reverse()
list2.reverse()
list3.reverse()
print(list3, list2, list1)