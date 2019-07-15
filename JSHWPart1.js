window.onload = function() {
    document.getElementById("answerAlert").addEventListener("click", function() {
        let nth = document.getElementById("Nth").value
        let a = 1;
        let b = 2;
        let aRay = languageOfNature(nth);
        alert("Mathmatics is the language of nature " + aRay);
        sortFibonacci(aRay);
        factory(nth)
        /*
        let j = sortFibonacci(k);
        alert("Sorted " + j);
        */
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


function sortFibonacci(aRay) {
    let bRay = [];
    m = 0;
    n = 0;
    for(i = 0; i < aRay.length; i++) {
        for(j = 1; j < aRay.length; j++) {
            if (aRay[j] > aRay[i]) {
                bRay.push(aRay[j]);
                // aRay.splice(j, 1);
                // //Swap only if j is bigger
                // m = j;
                // n = j - 1;
                // while(m > 0) {
                //     bRay.push(aRay[0]);
                //     aRay.shift();
                //     m--;
                // }
                // aRay.push(hold);
                // while(n > 0)
                //     aRay.push(bRay[0]);
                //     bRay.shift();
            }
        }
    }
    alert("This is your sorted Array:  " + bRay)
    return bRay;

}
//TODO:  -Results in an infinite loop
function factory(n) {
    while (n > 0) {
        if (n != 1) {
            j = j + n;
            n--;
            factory(n);
        } else {
            alert("Factoral of your entry is:  " + j);
        }
    }
}




