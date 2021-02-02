class PersonCL(val firstName: String = "Peter", val lastName:String="Parker") {

    var nickName:String? = null

    set(value) {
        field = value
        println("the new nickName is $value")
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
    per.nickName = "Man"
    per.nickName = "New NickName"
}