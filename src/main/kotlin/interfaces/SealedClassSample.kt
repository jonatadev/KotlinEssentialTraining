package interfaces

// https://kotlinlang.org/docs/sealed-classes.html#sealed-classes-and-when-expression
// https://medium.com/@joelamalio/kotlin-sealed-class-aaf626e344e1
// https://blog.logrocket.com/guide-using-sealed-classes-kotlin/
// https://www.baeldung.com/kotlin/sealed-classes
// https://www.javatpoint.com/kotlin-sealed-class
// https://proandroiddev.com/understanding-kotlin-sealed-classes-65c0adad7015
//

class SealedClassSample {
}

fun render(state: UiState) = when (state) {

//    when(state) { // Add remaing branches
//        is UiState.Error -> TODO()
//        is UiState.Loaded -> TODO()
//        UiState.Loading -> TODO()
//    }
//    else -> {}

    is UiState.Error -> println("Error")
    is UiState.Loaded -> println("Loaded: ${state.title}")
    UiState.Loading -> println("Loading")
}

fun main() {

    var state: UiState = UiState.Loading
    render(state)

    state = UiState.Loaded("Kotlin", "Is Cool!")
    render(state)

    state = UiState.Error(IllegalStateException())
    render(state)
}