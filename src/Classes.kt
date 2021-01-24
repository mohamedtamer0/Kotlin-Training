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