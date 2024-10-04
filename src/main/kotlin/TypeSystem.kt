package com.kotlin;

fun main(args: Array<String>) {
    val myInt : Int = 10
    val anInt : Int = 20
    val aLong : Long = anInt.toLong()

//  int lowest = ( a < b ) ? a : b;
    val lowest = if( myInt < anInt ) myInt else anInt
    println("The lowest value is $lowest")
    

    var temp = 80
    val isAirConditionedOn = if( temp >= 80 ) {
        println("It is warm")
        true;
    } else {
        println("It is not so warm")
        false;
    }
    println("Is the air conditioner on: $isAirConditionedOn")
  
    println()
    println()
    
    val burgersOrdered = 1

    when(burgersOrdered){
        0 -> println("Not hungry")
        1,2 -> println("Hungry")
        3 -> println("Very hungry")
        else -> {
            println("Are you sure!")
        }
    }

    println()

    when(burgersOrdered) {
        Math.abs(burgersOrdered) -> print("Ordered 0 or more burgers!")
        else -> {
            println("Ordered less than 0")
        }
    }

    when(burgersOrdered) {
        0 -> println("We need orders")
        in 1..4 -> println("Got some orders")
        in 5..9 -> println("Business is up")
        else -> {
            println("Not sure")
        }
    }

    



}