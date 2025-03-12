#!/bin/bash

read -p "Introduzca su nombre: " NOMBRE

PRIMERA_LETRA=$(echo $NOMBRE | cut -c 1 )

if [ $PRIMERA_LETRA = "J" ] || [ $PRIMERA_LETRA = "j" ];then
    echo "Empieza por J"
else
    echo "No empieza por J"
fi