import random
import time

def bogo(list):
    intentos = 0
    def is_sorted(list):
        for i in range(0, len(list)-1):
            if list[i] > list[i+1]:
                return False
        return True


    while not is_sorted(list):
        random.shuffle(list)
        intentos = intentos + 1
        time.sleep(0.08)

        print(intentos)
        print(list)
    return list



lista1 = list({1, 4, 5 ,2 ,7 , 1, 19})

print(lista1)
bogo(lista1)
