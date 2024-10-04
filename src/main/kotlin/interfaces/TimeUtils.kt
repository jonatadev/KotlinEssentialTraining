package interfaces

private val hourInMillis = 60 * 60 * 1000

//internal fun millisFourHours(hours: Int) = hours * hourInMillis

fun Int.millisForHours() = this * hourInMillis

// https://www.digitalocean.com/community/tutorials/kotlin-visibility-modifiers-public-protected-internal-private

