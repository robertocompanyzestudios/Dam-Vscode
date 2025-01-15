function mostrarTabla(){
    let min = parseInt(document.getElementById("min").value);
    let max = parseInt(document.getElementById("max").value);

    let tablaResultado = "<table>";
    for(let i = min; i <= max ; i++){
        tablaResultado = tablaResultado +
            "<tr><td>" + (min + "x" + i) + "</td><td>" + (min * i) + "</td>"
    }

    tablaResultado = tablaResultado + "</tr></table>"

    document.getElementById("tablaResultado").innerHTML = tablaResultado
}