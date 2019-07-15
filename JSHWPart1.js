window.onload = function() {
    document.getElementById("answerAlert").addEventListener("click", function() {

        let a = 1;
        let b = 2;
        let k = languageOfNature();
        alert("Mathmatics is the language of nature " + k);

    })



}
//Pure Function
function languageOfNature() {
    m = 0;
    n = 1;
    let aRay = [];
    aRay.push(m);
    aRay.push(n);
    for(i = 0; i < 10; i++) {
        p = m + n;
        aRay.push(p);
        m = n;
        n = p;
        console.log(aRay);
    }

    return aRay;
}



