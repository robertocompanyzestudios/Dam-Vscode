function intercambiar(){
    texto1 = document.getElementById("texto1")
    texto2 = document.getElementById("texto2")

    auxiliar = texto1.value
    texto1.value = texto2.value
    texto2.value = auxiliar
}