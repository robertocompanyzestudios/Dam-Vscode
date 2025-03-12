#!/bin/bash


read -p "Introduzca un numero: " NUM

let RESTO=$NUM%10
if [[ $RESTO -eq 0 ]]; then
    echo "$NUM es un multiplo de 10"
else
    echo "$NUM no es un multiplo de 10"
fi