package new

fun main() {
    var name: String? = "Tamer"
    name = null
    println(name)

    var num: Int? = 55
    num = null
    println(num)


    /// Nullable Safe Calls

    var fullName: String? = "Mohamed Tamer"
    var length = fullName?.length
    val length2 = if (fullName != null) fullName.length else 0
    val length3 = fullName?.substring(0, 2)?.length


    /// The Elvis Operator

    var lastName: String? = "Habiba"
    var length4: Int = if (lastName != null) lastName.length else 0

    val length5: Int = lastName?.substring(0, 2)?.length ?: 0
    println(length5)


}