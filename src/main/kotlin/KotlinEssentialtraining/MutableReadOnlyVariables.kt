package KotlinEssentialtraining

class MutableReadOnlyVariables {
}

fun main() {

    val ourFirtVariable: Boolean = true // Read Only Variable

    println(ourFirtVariable)

//    ourFirtVariable = false // Val cannot be reassigned

    // Mutable Variable

    var name: String = "Mutable"
    name = "Mutable here!"

    var sum = 10 // Type Inference
}