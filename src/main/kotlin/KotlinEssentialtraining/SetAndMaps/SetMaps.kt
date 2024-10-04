package KotlinEssentialtraining.SetAndMaps

class SetMaps {}

fun main() {

    // No duplicate elements
    val languages = setOf("Kotlin", "Java", "C++", "Kotlin")

    for (language in languages)
        println(language)

    println( languages.size )
    println( languages.contains("Kotlin") )

    val countries: MutableSet<String> = mutableSetOf("France", "Uk", "Russia")
    countries.add("Brazil")
    countries.remove("Russia")

    val testScores = mapOf(Pair(10, 91.2), Pair(20, 100.0), 30 to 90.0)
    println(testScores[20])

    for(record in testScores)
        println("Score for user ${record.key} was ${record.value}")

    println()

    for( (idKey, scoreValue) in testScores )
        println("Score for user $idKey was $scoreValue")

    val multableMap = mutableMapOf(1 to "A", 2 to "B", 3 to "C")

    println("multableMap.forEach{ key, value -> println(value) }")
    multableMap.forEach{ key, value -> println(value) }

    println( multableMap.filter { entry -> entry.key < 2 } )

}