package old

fun main(args: Array<String>) {
    var obj1 = C()
    obj1.Age(25)
}






class C {
    fun Age(a :Int) {
        when(a) {

            //Range
            in 22..30 -> println("Ahmed , mohamed")
            in 31..40 -> println("Ali , omar")

            else -> println("None")
        }
    }
}