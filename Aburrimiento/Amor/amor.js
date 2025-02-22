
function moveNoButton() {
    let noButton = document.querySelector('.no');
    let x = Math.random() * (window.innerWidth - 100);
    let y = Math.random() * (window.innerHeight - 50);

    //Si no existe un boton transparente
    if(!document.querySelector('.translucent')){
        //Genera un boton nuevo y transparente para reemplazar el boton "No" y que el Si no se descentre
        translucentButton = document.createElement("button")
        translucentButton.classList.add("translucent")
    }


    

    //el div que contiene los botones
    let buttonsDiv = document.querySelector('.buttons');
    buttonsDiv.appendChild(translucentButton)

    //cambia la posicion de relative a absolute (para poder moverlo libremente)
    noButton.style.position = "absolute";
    noButton.style.left = `${x}px`;
    noButton.style.top = `${y}px`;
}

function showMessage() {
    document.getElementById('thankYouMessage').style.display = 'block';
    alert('Te espera un día increible, te amo💙.');
}

function createHearts() {
    for (let i = 0; i < 20; i++) {
                let heart = document.createElement('div');
        heart.classList.add('heart');
        document.body.appendChild(heart);

        //fija la posicion de los corazones
        heart.style.bottom = Math.random() * window.innerHeight + 5 +'px';
        heart.style.position = 'fixed';
        heart.style.left = Math.random() * window.innerWidth + 5 + 'px';

        heart.style.animationDuration = (Math.random() * 3 + 3) + 's';
    }
}
createHearts();
