package interfaces

class DataClassesSample {}

fun main() {

    val task1 = Task("10","Build search feature")
    val task2 = Task("10","Add analytcis")

    println(task1.name)
    println(task2.name)

    if(task1.name == task2.name) {
        println("Task are equals.")
    } else {
        println("Task are different.")
    }

    if(task1 == task2) {
        println("Task are equals.")
    } else {
        println("Task are different.")
    }

    val task2Copy = task2.copy(id = "C3")

    if(task2Copy == task2) {
        println("Task are equals.")
    } else {
        println("Task are different.")
    }

    val (id, name) = task1
}
