//building up machinery for making a request

window.onload = function() {
    document.getElementById("answerAlert").onclick = function() {
        sendAjaxGet("api.magicthegathering.io/v1/cards?name=nissa", justSeeTheResult)
        alert("Does not get element!");
    };
}

function sendAjaxGet(url, func) {
    let xhr = new XMLHttpRequest();
    xhr.onreadystatechange = function() {
        if (this.readyState == 4 && this.status == 200) {
            func(this);
        }
    }

    xhr.open("GET", url, true); 
    xhr.send();

}

function justSeeTheResult(xhr) {
    let cards = JSON.parse(xhr.responseText);
    console.log(cards);
    document.getElementById("cards").innerText = "Current Cards: "+ cards.main.temp;
}

