package KotlinEssentialtraining.StructuresIfElseEtc

class ExceptionsSample {}

fun main(args: Array<String>) {

    val message = try {
        throw  IllegalStateException()
        "The value is ${10/0}"
    } catch (error: ArithmeticException) {
        "Error was thrown!"
    } catch (error: java.lang.IllegalStateException) {
        "Error was IllegalState"
    }
    print(message)
}