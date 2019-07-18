window.onload = function() {
    document.getElementById("answerAlert").addEventListener("click", function() {
        let nth = document.getElementById("numberOfBooks").value;
        alert("The number of books you want" + nth);

    })
}