package interfaces

import kotlin.properties.Delegates

// Lazy Delegate

class ViewModel {

    var currentQuery: String by Delegates.observable("") {
        property, oldValue, newValue -> println("$oldValue -> $newValue")
    }

    val logger: Logger by lazy {
        println("Initilizing the logger")
        ApplicationLogger(SimpleLogger())
    }

    fun search(query: String) {
        logger.log("query", query)
    }
}