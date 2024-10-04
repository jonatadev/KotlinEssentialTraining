package KotlinEssentialtraining.Functions

class HigherOrderFunctions {
}

fun printCalculatedValue(value1: Int, value2: Int, calculator: (Int, Int) -> Int) {
    println("The value is: ${calculator(value1, value2)}")
}

// https://kotlinlang.org/docs/lambdas.html
// https://blog.logrocket.com/a-complete-guide-to-kotlin-lambda-expressions/
// https://vtsen.hashnode.dev/what-is-trailing-lambda-and-comma-in-kotlin
// https://typealias.com/start/kotlin-lambdas/

fun printFormattedName(first: String, last: String, formatter: (String, String) -> String) {
    println(formatter(first, last))
}

val basicFormatter: (String, String) -> String = { first, last ->
    "$first $last"
}

val fancyFormatter: (String, String) -> String = { first, last ->
    "First name is $first and last name is $last"
}

fun main() {

//  Trailling Lambda Syntax
    printCalculatedValue(2, 2) { value1, value2 ->
        value1 + value2
    }

    printCalculatedValue(2, 2, { value1, value2 ->
        value1 - value2
    })

    printFormattedName("Nate", "Ebel", basicFormatter)
    printFormattedName("Nate", "Ebel", fancyFormatter)

    printFormattedName("Nate", "Ebel") { first, last ->
        "$last $first"
    }
}

