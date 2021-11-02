package old
object EntityFactory1 {
    fun create() = Entityy("id", "name")
}

class Entityy (val id : String, val name: String){
    override fun toString(): String {
        return "id:$id name:$name"
    }
}


fun main(args: Array<String>) {
    val entity = EntityFactory1.create()
    println(entity)
}