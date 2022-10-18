let oldValue, newValue
let operatorValue = false
function butnclick(value) {
    console.log(value)
    if (value == "+") {
        oldValue = document.getElementById("screen").value;
        document.getElementById('screen').value = "+"
        operatorValue = true
    }
    else if (value == "*") {
        oldValue = document.getElementById("screen").value;
        document.getElementById('screen').value = "*"
        operatorValue = true
    }
    else if (value == "/") {
        oldValue = document.getElementById("screen").value;
        document.getElementById('screen').value = "/"
        operatorValue = true
    }
    else if (value == "-") {
        oldValue = document.getElementById("screen").value;
        document.getElementById('screen').value = "-"
        operatorValue = true
    }
    else {
         document.getElementById("screen").value += value;
    }
}
function btnclear() {
    document.getElementById("screen").value = ''

}

function equalbutton() {
    console.log(oldValue);
    newValue= document.getElementById('screen').value
    let text=oldValue.concat(newValue)
    console.log(text);
    document.getElementById('screen').value = eval(text)
}
