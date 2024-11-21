#!/bin/bash

cd ./vscode

# Obtener la fecha actual
fecha=$(date +"%Y-%m-%d_%H:%M")

# Inicializar el repositorio si no está inicializado
git init

# Agregar los cambios al índice
git add .

# Realizar el commit con la fecha en el mensaje
git commit -m "commit $fecha"

# Subir los cambios al remoto (rama master)
git push -u origin master

