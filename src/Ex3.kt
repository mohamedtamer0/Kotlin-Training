fun main(args: Array<String>) {
//    var obj1 = b()
//    obj1.WeekDays(2)
}






class B {
    fun WeekDays(a :Int) {
        when(a) {
            1 -> println("Sun")
            2 -> println("MOn")
            3 -> println("Tues")
            4 -> println("Wed")
            5 -> println("Thurs")
            6 -> println("Fri")
            7 -> println("Sat")
            else -> println("None")
        }
    }
}