

fun sayHey(greeting:String, vararg itemsToGreet:String) {
    itemsToGreet.forEach {
        itemToGreet -> println("$greeting $itemToGreet")
    }
}

fun greetPerson(greeting:String, name:String) = println("$greeting $name")

fun main() {

    val person = Person()
    person.printInfo()


//    val interestingThings = arrayOf("Kotlin", "Java", "JS")
//    sayHey("Hi" , *interestingThings)
}