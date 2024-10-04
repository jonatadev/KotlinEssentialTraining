package KotlinEssentialtraining

import java.io.File
import kotlin.io.path.writeLines

class ReadingScores {}

fun main(args: Array<String>) {

    val scoreFile = File("scores.txt")

    scoreFile.forEachLine { line -> println(line) }

    val sortedLines = scoreFile.readLines().sorted()

    val outputFile = File("sorted-scores.txt").toPath()
    outputFile.writeLines(sortedLines)
}