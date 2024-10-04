package interfaces

// Singleton, only one instance

object NetworkConfig : NetworkInfoProvider {

    val baseUrl = "http://<some_url>"
    val userAgent = "demo-app"

    override fun getNetworkDetails(): String {
        return "$baseUrl - $userAgent"
    }
}