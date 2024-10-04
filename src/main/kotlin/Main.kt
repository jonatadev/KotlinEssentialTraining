// Variáveis das classes são publicas por padrão

fun main(args: Array<String>) {

    val person = Person(0, "Jonatas", "Alves da Silva")
    person.printName() // Jonatas Alves da Silva

    val student: Person = Student(32, "Foo", "Bar")
    student.printName() // Student: Foo Bar
}