function sumar(){
    let operando1 = parseInt(document.getElementById("operando1").value);
    let operando2 = parseInt(document.getElementById("operando2").value);

    let resultado = operando1 + operando2;
    document.getElementById("resultado").value = resultado;

}