package com.kotlin;

fun main(args: Array<String>) {
    val location = object{ // Anonymous object
        var xPosition = 200
        var yPostion = 400
        fun printIt() {
            println("Position = ($xPosition, $yPostion)")
        }
    }
    
    location.printIt()

    location.xPosition = 2000
    location.yPostion = 3000

    location.printIt()

}