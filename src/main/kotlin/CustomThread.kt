import java.util.concurrent.Executor
import java.util.concurrent.Executors

class CustomThread : Thread("CustomThread") {

    override fun run() {
        super.run()
        println(Thread.currentThread().name)
        println("CustomThread.run()")
    }
}

//Thread-0
//CustomThread.run()

class CustomRunnable : Runnable {

    override fun run() {
        println("CustomRunnable.run()")
    }
}

val executor = Executors.newSingleThreadExecutor()
val multiThreadExecutor = Executors.newFixedThreadPool(3)

fun main() {

    println(Thread.currentThread().name)
    CustomThread().start()

    Thread(CustomRunnable()).start()

    executor.submit(CustomRunnable())
}