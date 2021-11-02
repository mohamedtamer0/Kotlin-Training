package old

fun <T: Comparable<T>> compareFun(input1: T, input2:T): T {

    val res = input1.compareTo(input2)
    return if (res > 0 ) input1 else input2

}


fun main(args: Array<String>) {
    val int = compareFun(1,2)
    val string = compareFun("Mohamed","Tamer")
    val float = compareFun(12f,14f)
    val long = compareFun(4L,2L)


    println(int)
    println(float)
    println(string)
    println(long)
}