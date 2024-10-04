package com.kotlin;

fun main(args: Array<String>) {
    var x = 0;
    
    while(x<10){
        println("x = $x")
        x +=3
    }
    
    println()

    do {
        println("x = $x")
        x -= 3
    } while( x > 0 )

//  The classic for statement
    println("FOR - A Classic for loop.")

    for(item in 1..10) {
//      item++ // Error immutable
        println("$item, ")
    }

    for( item in 1..10 ) {
        print("$item, ")
    }

    var ndx = 0
    for( item in 10.rangeTo(20).step(20) ) {
        print("${++ndx}" $item, ")
    }
    println();
  
}

