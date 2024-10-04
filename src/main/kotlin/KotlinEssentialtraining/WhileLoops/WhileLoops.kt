package KotlinEssentialtraining.WhileLoops

class WhileLoops {}

fun main(args: Array<String>) {

    var counter = 0

    while (counter < 5) {
        println(counter)
        counter++
        if (counter == 3)
            break
    }

    do {
        println(counter)
        counter += 1
    } while (counter > 1)

    for(i in 0 until 5) {
        println(i)
    }

    for(i in 0 .. 5) {
        println(i)
    }

    for(i in 10 downTo  0) {
        println(i)
    }

    for(i in 10 downTo  0 step 3) {
        println(i)
    }
}