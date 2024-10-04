package KotlinEssentialtraining

class CharStringDataTypes {}

fun main() {

    // String is Immutable

    val aChar: Char = 'a'
    val aNumericChar: Char = '1'

    // String
    val name: String = "Hello \n World"
    println(name)

    // RAW String
    val raw = """
    |Some
        multiline
    text
        is going on
    here
    """.trimMargin()

    println(raw)

    // String Templating
    val aNumber = 10
    val concatTemplate = "The number ${1 + aNumber}"
    println(concatTemplate) // The number 11

    val something: String = " "
    println(something.isNotBlank()) // false


}