package interfaces

interface StringProvider {

    val placeholder: String

    fun getString(id: Int) : String = id.toString()
}