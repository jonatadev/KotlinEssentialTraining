package com.kotlin;

// Functions in Kotlin

fun main(args: Array<String>) {
    println("10 + 20 = ${ myFunction(20, 20) }") // 10 + 20 = 40
    println("30 + 40 = ${ myFunction2(30, 40) }") // 30 + 40 = 70
    println("50 + 60 = ${ myFunctionT(50, 60) }") // 50 + 60 = 110

    myDefaults(100,200, "Hello Default Values!")
    myDefaults(message = "Greetings!")
}

fun myFunction(param1: Int, param2: Int): Int {
    return param1 + param2;
}

// Expression Body Function
fun myFunction2(param1: Int, param2: Int): Int = param1 + param2;

// Expression Body Function Type Inference
fun myFunctionT(param1: Int, param2: Int) = param1 + param2;

// Default values, avoid overload as other languages
fun myDefaults(a1:Int = 10, a2:Int = 20, message: String = "Hi" ) : Int {
    var results = a1 + a2
    println(message)
    return results
}
