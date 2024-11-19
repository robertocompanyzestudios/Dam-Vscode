let nuevoEnlace = document.createElement('a');
let nodoTexto = document.createTextNode("Ejemplo")
nuevoEnlace.appendChild(nodoTexto)

let cuerpoRef = document.getElementsByTagName("body")[0];
cuerpoRef.appendChild(nuevoEnlace);