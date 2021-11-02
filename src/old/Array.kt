package old

fun main(args: Array<String>) {


    val names = arrayOf("Tamer","Mohamed", "Ahmed")
    println(names[0])
    println(names[1])
    println(names[2])

    val numbers = arrayOf(565,6456, 5464)
    println(numbers[0])
    println(numbers[1])
    println(numbers[2])


    val arr = arrayOf(true,34, "Ahmed")
    println(arr[0])
    println(arr[1])
    println(arr[2])


    val f = CharArray(5)
    val i = IntArray(9)

    println(f.count())
    println(i.count())


    println("======================================")


    //Array With Looping
    val names2 = arrayOf("Tamer","Mohamed", "Ahmed",565,6456, 5464)

    var x =0
    while (x < names2.count()) {
        println(names2[x])
        x++
    }




    val names3 = arrayOf("Tamer","Mohamed", "Ahmed",565,6456, 5464)

    for (str in names3) {
        println(str)
    }


    println("======================================")

    //Two D Array

    val row1 = arrayOf("Tamer","Mohamed", "Ahmed",2342,87889, 5464)
    val row2 = arrayOf("Omar","Mohamed", "Ahmed",56765,6456, 675)
    val row3 = arrayOf("Osama","Mohamed", "Ahmed",2341,6456, 7867)


    val table = arrayOf(row1,row2,row3)

    var r = 0
    while (r < table.count()){

        var c = 0
        while (c < table[r].count()) {
            print("${table[r][c]}" + " ; ")
            c++
        }
        println()
        r++
    }


    println("======================================")


    for (row in table) {
        for (col in row) {
            print("$col" + " - ")
        }
        println()
    }



    println("======================================")

    val list = ArrayList<String>()
    list.add("HTML")
    list.add("CSS")
    list.add("JS")
    list.add("Kotlin")

    println(list.get(0))

    list.removeAt(0)

    println(list.get(0))


    for (s in list) {
        print(s + " ; ")
    }

    println("======================================")




}