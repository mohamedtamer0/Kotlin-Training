class PersonCL(val firstName: String = "Peter", val lastName:String="Parker") {

    var nickName:String? = null

    set(value) {
        field = value
        println("the new nickName is $value")
    }

    get() {
        println("the returned value is $field")
        return field
    }




    fun printinfo() {
        println("$firstName ($nickName) $lastName")
    }

//    init {
//        println("init 1")
//    }
//
//    constructor() : this("Peter", "Parker") {
//        println("Secondary constructor")
//    }
//
//    init {
//        println("init 2")
//    }


}


fun main(args: Array<String>) {
    val per = PersonCL()
    per.lastName
    per.firstName
    println(per.nickName)
    per.printinfo()
}