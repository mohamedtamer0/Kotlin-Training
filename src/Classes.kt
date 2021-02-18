
class Person2(var firstName: String, var lastName: String) {
    val fullName
    get() = "$firstName $lastName"
}













class InitOrderDemo(name: String) {
    val firstProperty = "First property : $name".also(::println)

    init {
        println("First initializer block that prints ${name}")
    }

    val secondProperty = "Second property: ${name.length}".also(::println)

    init {
        println("Second initializer block that prints ${name.length}")
    }

}


fun main(args: Array<String>) {
    val cla = InitOrderDemo("Hello")

    println("////////////////////////////////////")

    val johan = Person2(firstName = "Johnny", lastName = "Appleseed")
    println(johan.fullName)

    var homeOwner = johan
    johan.firstName = "Johan"

    println(johan.firstName)
    println(homeOwner.firstName)

    println(johan === homeOwner)

    val impostorJohan = Person2(firstName = "Johan", lastName = "Appleseed")

    println(johan === homeOwner)
    println(johan === impostorJohan)
    println(impostorJohan === homeOwner)


}







//class Car (val make: String, val model: String, var color: String) {
//    fun accelerate() {
//        println("vroom")
//    }
//    fun details() {
//        println("This is a $color $make $model")
//    }
//}
//
//class Truck(val make : String, val model: String, val towing:Int) {
//    fun tow() {
//        println("taking the horses to the rodeo")
//    }
//}
//
//
//open class Vehicle(val make: String, val model:  String) {
//    fun accelerate() {
//        println("Vrooooooom")
//    }
//
//    fun park() {
//        println("Parking the Vehicle")
//    }
//
//    fun brake(){
//        println("STOP")
//    }
//
//}
//
//class Car2(make: String, model: String, var color: String) : Vehicle(make,model) {
//
//}
//
//
//
//fun main(args: Array<String>) {
//
//    val car = car("Toyota", "Avalon", "Red")
//    println(car.make)
//    println(car.model)
//    car.accelerate()
//    car.details()
//
//    val truck = Truck("Ford", "F-150", 10000)
//    truck.tow()
//
//    val tesla = Car2("Tesla", "Models", "Red")
//    tesla.accelerate()
//
//
//
//}