package old

fun myFun(name:String):Pair<String,Int> {
    return Pair("Tamer",23)
}


fun main(args: Array<String>) {
    val myWord = myFun("Tamer")
    println(myWord.first)
    println(myWord.second)
}