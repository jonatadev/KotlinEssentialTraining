package KotlinEssentialtraining

class NullableValues {}

fun main() {

//    var aNullableString: String = null
    var aNullableString: String? = null
//    aNullableString = "SomeNull"

//  Lead to crash
//    println(aNullableString!!.length) // java.lang.NullPointerException

//    Null Safe Call
    println(aNullableString?.length) // null

//    Elvis Operator
    println(aNullableString?.length ?: "The value was null!") // The value was null!

}