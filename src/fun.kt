fun sayHello(greeting:String, vararg itemsToGreet: String) {
    itemsToGreet.forEach {
        itemsToGreet ->
        println("$greeting $itemsToGreet")
    }
}

fun main(args: Array<String>) {
    val arr = arrayOf("Kotlin", "Java")
    sayHello("Hi", *arr )
}