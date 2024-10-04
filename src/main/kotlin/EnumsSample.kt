import interfaces.Direction
import interfaces.HighlightColor

class EnumsSample {

}

fun main() {

    val direction: Direction = Direction.NORTH

    println(direction.name)
    println(direction.ordinal)

    val parseDirection = Direction.valueOf("WEST")
    println(parseDirection.name)

    val apiValue = Direction.values()[2]
    println(apiValue.name) // SOUTH

    val color = HighlightColor.BLUE
    println(color.value) // 3446251
}