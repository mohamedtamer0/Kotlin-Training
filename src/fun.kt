fun sayHello(greeting:String, vararg itemsToGreet: String) {
    itemsToGreet.forEach {
        itemsToGreet ->
        println("$greeting $itemsToGreet")
    }
}

fun main(args: Array<String>) {
    sayHello("Hi", "Kotlin", "Java")
}