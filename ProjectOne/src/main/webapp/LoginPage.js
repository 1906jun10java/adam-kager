window.onload = function() {
    document.getElementById("answerAlert").addEventListener("click", function() {
        let friend = document.getElementById("username").value;
        alert("Hello " + friend);

    })
}