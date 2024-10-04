package com.kotlin;

interface Vehicle {
    val makeName : String
    fun go(){
        println("Vroom, vroom")
    }

    fun stop(){
        println("Screehing")
    }

    fun getMpg() : Int {
        return 50
    }

    fun getDoors() : Int 
}


class Car : Vehicle {
    override val makeName = "Ford"
    override fun getDoors() : Int {
        return 5;
    }

}

fun main(args: Array<String>) {
    val myCar = Car()
    myCar.go() // Vroom, vroom
    println("My car make = ${myCar.makeName}") // My car make = Ford
    println("My car doors = ${myCar.getDoors()}") // My car doors = 5
}