package new

fun main() {

    val name = "Mohamed Tamer"
    println(name.initials())

}



fun String.initials():String {
    val values =this.split(' ')
    val firstInitial = values[0].substring(0,1)
    val lastInitial:String = values[1].substring(0,1)
    return "$firstInitial $lastInitial"

}