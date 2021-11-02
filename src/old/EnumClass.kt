package old

enum class EnumClass(val num:Int) {
    Sunday(1),
    Monday(2),
    Tuesday(3),
    Wednesday(4),
    Thursday(5),
    Friday(6),
    Saturday(7)

}


fun main(args: Array<String>) {
    val day = EnumClass.Friday
    println(day)
    println(day.num)
}