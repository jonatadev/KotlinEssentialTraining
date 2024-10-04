package KotlinEssentialtraining.StructuresIfElseEtc

class StructureIfElse {}

// Statements Vs. Expressions

fun main() {

    var someVariable = 5

    if( someVariable > 3 ) {
        println("The value was greater than 3")
    } else if (someVariable > 2) {
        println("Greater than 2")
    }

    when { // -> Error Operator
        someVariable > 3 -> println("The value was greater than 3")
        someVariable > 2 -> println("The value was greater than 3")
        else -> println("not greater")
    }

    when ( someVariable ) {
        0,1 -> println(" The value was 0 or 1 ")
        2 -> println(" The value is 2 ")
        3 -> println(" The value is 3 ")
    }

    val message = if (someVariable > 3) {"The value is greater than 3"} else {
        "The value was not greater than 3"
    }
}

fun getMessage(input: Int): String {
    return if(input >3) {
        "Greater than 3"
    } else {
        "Not greater than 3"
    }
}

fun getMessageT(input: Int) = if (input > 3) {
    "Greater than 3"
} else {
    "Not greater than 3"
}

fun getMessageWithWhen(input: Int) = when (input) {
    3 -> "Value is 3"
    else -> "Value is not 3"
}