package new
typealias AuthToken = String

fun main() {
    val obj = User("Tamer", "498378DKDJDHD-HDKDKDH63")
    println(obj.authToken)
}

data class User(val userName:String, val authToken:AuthToken)