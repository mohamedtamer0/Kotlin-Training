package new


fun main() {
    printBookInfo("Green Book", "TT")
}


fun printBookInfo(title:String, vararg authors:String) {
    println("$title - Authors: ")
    authors.forEach { println(it) }
}