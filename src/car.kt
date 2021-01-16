fun main(args: Array<String>) {
    var obj1 = car1()

    obj1.speed = 100
    obj1.reduceSpeed()
}



class car1 {
    var name: String = ""
    var model : Int = 0
    var speed : Int = 0


    fun  reduceSpeed() {
        speed = speed - 10

        println(speed)
    }

}