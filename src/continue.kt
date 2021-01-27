fun main(args: Array<String>) {

    var str = "Mohamed Tamer"

    for (i in str) {
        if (i == 'a') {
            continue
        }
        println(i)
    }

    println("========================")



    Return@ for (x in 1..10) {
        for (j in 1..10) {
            println("Element $x")
            if (j == 5) {
                break@Return
            }
        }
    }



}