package new

fun main() {
    var name1 = "Mohamed"
    var name2 = "Tamer"
    println(name1 != name2)


    println("==========================")

    //Referential Equality
    var a = Person("Tamer")
    var b = Person("Tamer")

    println(a !== b)

    // === equality
    // !== inequality





}

class Person(var name:String)