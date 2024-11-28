function agregarNota(){
    let nota = document.getElementById("nota").value;
    let prioridad = document.getElementById("prioridad").value;
    let tiempo = document.getElementById("tiempo").value;

    let tarea = document.createElement("li");
    tarea.className ="tarea"
    tarea.innerHTML =nota + " | Tiempo estimado: " + tiempo + " minutos | prioridad: " + prioridad
    let lista = document.getElementById("lista-tareas");
    lista.appendChild(tarea);

}

function borrarNota(){
    let lista = document.getElementById("lista-tareas");
    let tarea = document.getElementById("borrar-index").value;
    let index = tarea - 1;
    let tareas = document.getElementsByClassName("tarea")[index];
    console.log(tareas)

    lista.removeChild(tareas);
}