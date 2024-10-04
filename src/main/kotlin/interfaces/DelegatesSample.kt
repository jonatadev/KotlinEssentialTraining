package interfaces

// Delegates
// https://kotlinlang.org/docs/delegation.html
// https://www.tutorialspoint.com/kotlin/kotlin_delegation.htm
// https://proandroiddev.com/delegation-in-kotlin-e1efb849641

class DelegatesSample {
}

fun main() {

    val appLogger = ApplicationLogger(SimpleLogger())
    appLogger.log("example", appLogger) // example: interfaces.ApplicationLogger@6d03e736

    val viewModel = ViewModel()
    viewModel.search("kotlin")
    viewModel.search("Code")
}