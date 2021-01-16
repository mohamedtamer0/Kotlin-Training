fun main(args: Array<String>) {
    var person1 = Human()
    var person2 = Human()
    person1.name = "Mohamed"
    person1.age = 23
    person1.eyeColor = "Blue"
    person1.speak()

    person2.name = "Tamer"
    person2.age = 40
    person2.eyeColor = "black"
    person2.speak()


}



class Human {

    var name :String = ""
    var age :Int = 0
    var eyeColor :String =""

    fun speak() {
        println("My Name is: " + this.name)
        println("Age : " + this.age)
        println("Eye Color : " + this.eyeColor)
    }


}