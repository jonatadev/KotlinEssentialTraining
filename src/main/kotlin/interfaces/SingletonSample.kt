package interfaces

class SingletonSample {}

fun main(){

    println(NetworkConfig.baseUrl) // http://<some_url>
    println(NetworkConfig.getNetworkDetails()) // http://<some_url> - demo-app

    // Object Expression - Anonymous
    val provider: NetworkInfoProvider = object : NetworkInfoProvider {
        override fun getNetworkDetails(): String {
            TODO("Not yet implemented")
        }
    }
    provider.getNetworkDetails()
}