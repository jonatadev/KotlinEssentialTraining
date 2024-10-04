package KotlinEssentialtraining.UserInput

import java.io.File

class UserInput {}

fun main(args: Array<String>) {

    println("Enter a filename: ") // gradle.properties

    val filename = readLine() ?: ""

    println("You entered: $filename")

    val isValidFile = File(filename).isFile

    if(isValidFile){
        println("It is a valid file")
    } else {
        println("It is not a valid file")
    }
}