


fun printFilterString(list: List<String>, predicate: ((String) -> Boolean)?) {
    list.forEach {
        if (predicate?.invoke(it) == true){
            println(it)
        }
    }


}

val predicate: (String) -> Boolean = {
    it.startsWith("j")
}


fun main(args: Array<String>) {
    val list = listOf("Kotlin", "java", "C++")

    printFilterString(list,predicate)

    printFilterString(list, null)

}





























