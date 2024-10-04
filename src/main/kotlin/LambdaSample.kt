package com.kotlin;

data class Student(val name: String, var age: Int)

fun getStudents() : List<Student> {
    return listOf(
        Student("Jonatas",20),
        Student("Pedro", 21),
        Student("Mane", 22),
        Student("Tulio", 23),
        Student("Carlos", 25)
    )
}

fun main(args: Array<String>) {
    val students = getStudents()
    val combos = students.map { a -> a.name + " : " + a.age }
    println("Combos: " + combos)

    println("The oldest student : ${students.maxBy{it.age}}")

    val studentsWithlongNames = students.filter{it.name.length > 5}
    println("Long names: " + studentsWithlongNames)
}