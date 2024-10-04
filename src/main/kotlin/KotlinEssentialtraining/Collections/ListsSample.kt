package KotlinEssentialtraining.Collections

class ListsSample {}

fun main() {

    // List is Immutable by default in Kotlin

    listOf("Kotlin", "Code", "puppy")

    val stringList: List<String> = listOf("Kotlin", "Code", "puppy")

    val doubleValues = List<Int>(5) { index ->
        2 * index
    }

    doubleValues.forEach{ println(it) }

    val listOfInt = listOf(1, 2, 3, null)

    val emptyListString: List<String> = emptyList()

    val firstInt = listOfInt.get(0)
    val secondInt = listOfInt[1]

    // Mutable List
    val languages = mutableListOf<String>("Kotlin", "Java")
    languages[0] = "Java is the best!"

    val languagesFilter = mapOf(
        "Kotlin" to 5,
        "Go" to 6,
        "C++" to 7,
        "Java" to 2,
    )


    println()

    languagesFilter.filter { it.value >= 4 }
        .map { it.key }
        .sorted()
        .forEach { println(it) }
}