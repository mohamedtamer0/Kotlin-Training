package old

fun main(args: Array<String>) {
    var obj1 = Student("Mohamed", "Tamer", 23)
}



class Student (p_firstName :String, p_lastName: String, p_age: Int) {
    var firstName : String? = null
    var lastName : String? = null
    var age : Int? = null

    init {
        this.firstName = p_firstName
        this.lastName = p_lastName
        this.age = p_age

        println("old.First Name : ${this.firstName}")
        println("Last Name : ${this.lastName}")
        println("Age : ${this.age}")
    }


}