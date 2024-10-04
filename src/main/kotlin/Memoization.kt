package com.kotlin;

fun main(args: Array<String>) {
    functional
}

fun memo() {
    var fibonacci : (Long) -> Long = {it}
    fibonacci = {
        n : Long ->
        if(n >2){
            n
        } else {
            fibonacci(n - 1) + fibonacci(n-2)
        }                 
    }

    var m: (Long) -> Long = {it}
    m = { n: Long -> 
    if(n < 2) {
        n
    } else {
        m(n - 1) + m(n-2)
    }.memoize()

}



