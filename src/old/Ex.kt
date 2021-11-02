package old

abstract class Google {
    val name = "Tamer"
    val age = 23
    val isAvail = true

    fun myFun():String {
        return name
    }

    abstract fun myAge()
    fun  is_Avail():String{
        return isAvail.toString()
    }

}


class Facebook: Google() {
    override fun myAge() {
        println("This is old.Facebook class.")
    }
}


fun main(args: Array<String>) {
    val facebook = Facebook()
    facebook.is_Avail()
    facebook.myAge()
    facebook.myFun()

}