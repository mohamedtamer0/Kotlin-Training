

fun sayHey(greeting:String, vararg itemsToGreet:String) {
    itemsToGreet.forEach {
        itemToGreet -> println("$greeting $itemToGreet")
    }
}

fun greetPerson(greeting:String, name:String) = println("$greeting $name")

fun main() {

    val person = Person()
    person.printInfo()


    val thisNumber = 10
    when(thisNumber) {
        10 -> println("10")
        20 -> println("20")
        30 -> println("30")
        40 -> println("40")
        50 -> println("50")
        else -> {
            println("Nothing")
        }
    }



    val internalObject = object  {
        var num1 = 22
        var num2 = 44
        var result = num1 + num2
        fun mySum() {
            println("Sum = + $result")
        }
    }

    internalObject.mySum()





    val scoreNumResult = myScore.scoreResult()
    println(scoreNumResult)





}

object myScore {
    var scoreNums = arrayOf(20,40,33,89,90)
    fun  scoreResult() = scoreNums.size
}
