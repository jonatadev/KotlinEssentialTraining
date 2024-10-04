package KotlinEssentialtraining.Functions

class FunctionalTypes {}

var greatingFunction: (String) -> String = { thingToGreet -> // A lambda, function body
    "Hello $thingToGreet"
}

fun main() {

    println(greatingFunction("World"))

    greatingFunction = {thingToGreet ->
        "Hello $thingToGreet"
    }

    println(greatingFunction.invoke("World"))
}