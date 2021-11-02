package old

fun main(args: Array<String>) {

    var arr1 = IntArray(3)
    arr1[0] = 4
    arr1[1] = 6
    arr1[2] = 9

    println(arr1[1])
    var total : Int = 0
    for (x : Int in 0 until  arr1.size)
    {
        total = total + arr1[x]
    }
    println("Total = $total")





    var arr2 = Array(3){""}
    arr2[0] = "tt"
    arr2[1] = "sdf"
    arr2[2] = "sdf"

    println(arr2[1])


    for (i : Int in 0 until 3) {
        println(arr2[i])
    }






}