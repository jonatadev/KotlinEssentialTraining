package KotlinEssentialtraining

class CommandLineArguments {
}

fun varArgs(vararg args: String){
    println("First arg is ($args[0])")

    for (arg in args) println(arg)
}


fun main(args: Array<String>) {

}