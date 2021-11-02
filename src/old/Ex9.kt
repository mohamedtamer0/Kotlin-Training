package old

fun main(args: Array<String>) {



    var myList1 = arrayOf(1,2,3,4)
    var myList2 = arrayOf('a','b','c')
    var myList3 = arrayOf("Ahmed", "Mohamed", "Ali")

    for (i in myList1)
    {
        println(i)
    }


    var a = arrayOf(3,5,6)
    var b = arrayOf(6,2,8)
    var c = arrayOf(65,787,33)

    var list = arrayOf(a,b,c)

    println(list[2][0])


    for (x in list)
    {
        for (y in x)
        {
            print(y)
        }
        println()
    }


    //Arraylist

    var names = Array<String>(3){"a"}

    var  colors = ArrayList<String>()

    names[0] = "Tamer"
    names[1] = "Omar"

    colors.add("Red")
    colors.add("Blue")

    for (count in colors)
    {
        println(count)
    }

    colors.set(1,"Black")


    for (count in colors)
    {
        println(count)
    }


}