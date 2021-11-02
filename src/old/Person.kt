package old

class Person (val firstName:String = "Mohamed", val lastName:String = "Tamer") {

    var nickName:String? = null

    set(value) {
        field = value
        println("The New NickName Is $value")
    }

    get() {
        println("the returned value is $field")
        return field
    }

    fun printInfo() {
        val nickNameToPrint = if (nickName != null) nickName else "No nickName"
        println("$firstName ($nickNameToPrint) $lastName")
    }

}