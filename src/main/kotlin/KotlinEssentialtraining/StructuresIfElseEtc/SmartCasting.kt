package KotlinEssentialtraining.StructuresIfElseEtc

class SmartCasting {}

fun checkType(input: Any) {

    if(input == null) return // Return Early

    if(input is String) {
        println("Input is a String with length ${input.length}")
    }

    if(input !is Int) {
        println("Input is not an Int")
    }
}

fun ckeckTypeS(input: Any?) {
    when(input) {
        null -> println("input was null")
        is String -> println("Input was a String of length ${input.length}")
    }
}


fun main(args: Array<String>) {

    val aGenericVariable: Any = 5 // Generic Variable
    val anIntVariable: Int = aGenericVariable as Int //
}