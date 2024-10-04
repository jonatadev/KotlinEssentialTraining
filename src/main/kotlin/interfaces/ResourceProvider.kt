package interfaces

interface ResourceProvider : StringProvider {
    fun getDimension(id: Int): Long = id.toLong()
}