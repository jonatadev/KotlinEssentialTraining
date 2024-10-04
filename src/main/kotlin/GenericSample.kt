package com.kotlin;

fun main(args: Array<String>) {
    val a = 10
    val b = 30
    println("Generics max(10,30) = $max(a,b)")
}

fun <T : Comparable<T> > max(a1 : T, a2 : T) : T {
    val results = a1.compareTo(a2)
    return if( results > 0 ) a1 else a2
}