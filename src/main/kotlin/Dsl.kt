package com.kotlin;

interface Matcher<T>{
    fun test(lhs: T) Unit

    infix fun or(other: Matcher<T>): Matcher<T> = object : Matcher<T> {
        override fun test(lhs: T) {
            try {
                this @Matcher.test(this)
            } catch(e: RuntimeException) {
                other.test(lhs)
            }
        }
    }

    infix fun <T>T.shoud(matcher : Matcher<T>) {
        matcher.test(this)
    }

    infix fun <T> Collection<T>.shoud(fn: CollectionMatchers<T>.() -> Unit) {
        val matches = CollectionMatchers(this)
        matches.fn()
    }
   
}

class CollectionMatchers<T>(val collection: Collection<T>) {
    fun contains(rhs: T) : Unit {
        if(!collection.contains(rhs))
            throw RuntimeException("Collection did not contain $rhs")
    }

    fun notContains(rhs: T) : Unit {
        if(collection.contains(rhs))
            throw RuntimeException("Collection should not contain $rhs")
    }

    fun haveSizeLessThan(rhs: T) : Unit {
        if(collection.size >= size)
            throw RuntimeException("Collection should have size less than $size")
    }
}

fun unitTest() {
    val listOfNames = listOf("April", "May", "June")
    listOfNames should { not contain("Portia") }
}