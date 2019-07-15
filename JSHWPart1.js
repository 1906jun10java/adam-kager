window.onload = function() {
    document.getElementById("answerAlert").addEventListener("click", function() {
        let nth = document.getElementById("Nth").value
        let a = 1;
        let b = 2;
        let k = languageOfNature(nth);
        alert("Mathmatics is the language of nature " + k);
        let j = sortFibonacci(k);
        alert("Sorted " + j);
    })
}


function languageOfNature(nth) {
    m = 0;
    n = 1;
    let aRay = [];
    aRay.push(m);
    aRay.push(n);
    for(i = 0; i < (nth -2); i++) {
        p = m + n;
        aRay.push(p);
        m = n;
        n = p;
    }

    return aRay;
}

//TODO work at this more, it is not working and the logic may (mostlikely) is flawed
function sortFibonacci(aRay) {
    let bRay = []
    for(i = 0; i < aRay.size(); i++) {
        for(j = 1; j < aRay.size(); j++) {
            if (aRay[j] < aRay[i]) {
                bRay.push(aRay[i]);
            } else {
                bRay.push(aRay[j]);
            }
        }
    }
    return bRay;

}




