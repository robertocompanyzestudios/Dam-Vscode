let padre = document.getElementsByTagName("ul")[0];

let lista = document.createElement("li")
let enlace = document.createElement("a")

let texto = document.createTextNode("Pagina Web")

enlace.href= "https://moodle.iescierva.net/"

enlace.appendChild(texto)
lista.appendChild(enlace)
padre.appendChild(lista)