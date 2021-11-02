package old

fun main(args: Array<String>) {

    val xx = 2
    val yy = 2
    if (xx == yy) {
        println("yes")
    }
    if (xx != yy) {
        println("yes")
    }

    val accountBalance = 100
    val price = 50

    if (accountBalance >= price) {
        println("you can buy this!")
    }else {
        println("Sorry!")
    }


    val degrees = 50
    if (degrees >= 70) {
        println("this is some nice weather")
    }else if (degrees <70 && degrees >= 50){
        println("old.Grade a Weater")
    }else {
        println("Error")
    }

    val isHungry = false
    val isBored = true
    if (isHungry || isBored) {
        println("Lets get Pizza!")
    }

    val xxx = 2
    when (xxx) {
        1 -> println("XXX == 1")
        2 -> println("xxx == 2")
        else -> println("Not Equal")
    }


    fun vader(mood: String = "angry") {
        if (mood == "angry") {
            println("run for the hills Vader is $mood")
        }else {
            println("whatever you do")
        }
    }

    vader("happy")

    println("///////////////////////////////////")
    val num1 = 10
    val num2 = 20

    val nums = if (num1 > num2) num1 else num2
    println("the max number is $nums")


    var index =0
    for (v in 20.rangeTo(30).step(3)) {
        println("${++index} - $v")
    }




}