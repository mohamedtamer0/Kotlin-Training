fun main(args: Array<String>) {
    val imperals = listOf("tamer","mohamed","ahmed")
    println(imperals)
    println(imperals.sorted())
    println(imperals[1])
    println(imperals.last())
    println(imperals.contains("Luke"))


    val list = arrayListOf("tamer","mohamed","ahmed")
    println(list.size)
    list.add("free")
    println(list)
    list.remove("free")
    println(list)

    val mmap = mapOf("solo" to "Falcon", "Luke" to "Landspeeder")
    println(mmap["solo"])
    println(mmap.get("solo"))
    println(mmap.getOrDefault("Tamer", "this is ship doesnt exist"))
    println(mmap.values)

}