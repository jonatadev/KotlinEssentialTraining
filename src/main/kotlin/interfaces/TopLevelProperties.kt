package interfaces

import log

const val DEFAULT_CLICK_DELAY = 500

private fun log(error: Throwable) = println(error)

class TopLevelProperties {

}

val Int.isEven: Boolean // Extension Property
    get() = this.mod(2) == 0

fun main() {

//    val duration = hourInMillis
//    millisFourHours(5)

    4.millisForHours()
    10.millisForHours() // Extensions Functions

    "[abc]+".toRegex()

    println(8.isEven) // true
    println(7.isEven) // false

    5.log()
    "sample string".log()
    listOf(1, 2, 3).log()
}

// https://www.baeldung.com/kotlin/extension-methods
