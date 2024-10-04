package com.kotlin;

object MySingleton {
    var temperature = arrayOf(80,90,100)
    fun getLastTemperature() = temperature.last()
}


fun main(args: Array<String>) {
    // Object Declaration
    val temperature = MySingleton.getLastTemperature()
    println("Last Temperature = $temperature")
}