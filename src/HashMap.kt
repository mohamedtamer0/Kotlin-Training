fun main(args: Array<String>) {


    val map = mapOf(1 to "a", 2 to "b", 3 to "c")
    map.forEach { key, value -> println("$key -> $value") }




    var data1 = HashMap<String, String>()

    data1.put("user", "mohamed0")
    data1.put("pass", "12345")
    data1.put("name", "MohamedTamer")
    println(data1)

    data1.clear()
    println("$data1 + Clear")



}