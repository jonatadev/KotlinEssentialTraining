package KotlinEssentialtraining.Functions

class SampleFunctions {}

fun printGreeting() {
    println("Hello World!")
}

fun helloWorld() = "Hello World!" // public by default

fun defaultParameters(
    greeting: String = "Hello",
    thingToGreet: String = "World"
) = "$greeting $thingToGreet"

fun main() {

    fun localFunctons() = "LocalFunctions()"

    printGreeting()
    helloWorld()

    println(localFunctons())

    println(defaultParameters(thingToGreet = "Jonatas")) // named arguments
}

// Local Function ( Function inside a Function )
