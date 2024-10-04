package KotlinEssentialtraining.Collections

class ArraysSample {}

fun main() {

    val ints = arrayOf(1, 2, 3, 4, null)

    val nulls = arrayOfNulls<Int>(5)

    val custom = Array(5) {index -> index

    }

    val sizeOfArray = ints.size

    val firstValue = ints[0]
    val firstValuea = ints.get(0)

    ints.set(0, 99)

    val primitiveInts = intArrayOf(1, 2, 3, 4, 5)

    for(i in 0 until ints.size) {
        println(ints[i])
    }

    for(element in ints) {
        println(element)
    }

    ints.forEach { element -> println(element) }

    greetThings("Hey", arrayOf("Kotlin", "Programming"))

    greetThingsVarArgs("Hey", "Kotlin", "Programming")


}

// Varargs

fun greetThings(greeting: String, items: Array<Any>) {
    for(item in items) {
        println("$greeting $item")
    }
}

fun greetThingsVarArgs(greeting: String, vararg items: Any) {
    for(item in items) {
        println("$greeting $item")
    }
}