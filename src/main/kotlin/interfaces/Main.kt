package interfaces
//
fun main(args: Array<String>) {

    val someVariable: Any? = null;
    if(someVariable is StringProvider) {
        println("The variable was a StringProvider")
    }

    var stringProvider : StringProvider = DefaultResourceProvider()

    println(stringProvider.getString(5)) // id: 5
    println(stringProvider.placeholder) // <placeholder>
}