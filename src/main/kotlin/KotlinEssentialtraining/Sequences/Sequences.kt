package KotlinEssentialtraining.Sequences

class Sequences {}

fun main() {
    // Iterable Collections
    val languages = listOf("Kotlin", "C++", "Java")
        .filter { it.length > 4 }
        .map { it.length }

    // Sequences
    // https://kotlinlang.org/docs/sequences.html
    // https://www.baeldung.com/kotlin/sequences

    val languageSequence = sequenceOf("Kotlin", "C++", "Java")

    val fromIterable = listOf(1, 2, 3).asSequence()

    languageSequence.filter { it.length > 4 }.map { it.length }.take(2)
}