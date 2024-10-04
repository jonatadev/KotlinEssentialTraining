open class Person(
    age: Int,
    protected val firstName: String,
    protected val lastName: String // protected somente clases que herdam
) {

    init {
        check(age >= 0) {
            "A person's age cannot be negative!"
        }
    }

    val age: Int = age;
// open, informa que pode ser sobrecarregado na classe que foi extendida
    open fun printName() = println("$firstName $lastName")
}