package old

class AccessModifier {
     private var name : String? = null

     fun setName(p_Name :String) {
        this.name = p_Name
    }

    fun getName() :String?{
        return this.name
    }

}

fun main(args: Array<String>) {

    var obj1 = AccessModifier()
    obj1.setName("Tamer")
    var n = obj1.getName()
    println("Name Is : $n")

}