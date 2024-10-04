package com.kotlin;

data class Position(var x: Int, var y: Int) {
    operator fun plus(other : Position) : Position {
        return Position( x + other.x, y + other.y)
    }
}

fun main(args: Array<String>) {
   userOverloaded() // Position(x=1200, y=2100)
   showComponenets()
}

fun userOverloaded() {
    val p1 = Position(200, 100) 
    val p2 = Position(1000, 2000) 
    val p3 = p1 + p2 
    println(p3)
    
    // Destructing
}

class Point(val x: Int, val y: Int, val z: Int) {
    operator fun component1(): Int = x
    operator fun component2(): Int = y
    operator fun component3(): Int = z
}

fun showComponenets() {
    val myPoint = Point(5000, 500, 6000)
    val = (myX, myY, myZ) = myPoint
    println("myX = $myX, myY = $myY, myZ = $myZ")
}