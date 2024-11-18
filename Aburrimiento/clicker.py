import time
import os

# Función para simular clic izquierdo mediante /dev/input/mice
def click():
    os.system("echo -n -e '\\x09\\x00\\x00\\x00\\x00\\x00\\x00\\x00\\x00\\x00' > /dev/input/mice")

# Intervalo de tiempo entre clics (en segundos)
interval = 0.1  # 100 milisegundos

# Duración del autoclicker (en segundos)
duration = 10   # Duración de 10 segundos

# Tiempo de espera antes de empezar (en segundos)
time.sleep(5)  # Te da 5 segundos para cambiar de ventana antes de empezar

start_time = time.time()

while time.time() - start_time < duration:
    click()  # Llama a la función click
    time.sleep(interval)

print("Autoclicker finalizado.")
