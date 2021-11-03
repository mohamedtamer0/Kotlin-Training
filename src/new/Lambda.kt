package new

fun main() {

    //val lambdaName: (InputType) -> ReturnType = {arguments:InputType -> body}
    val greeter: (String) -> String = { name: String -> "Hello $name" }
    val lambda = greeter("Mohamed")
    println(lambda)


    val greeter2: (String, String) -> String = { firstName: String, lastName: String -> "Hello $firstName $lastName" }
    val lambda2 = greeter2("Mohamed", "Tamer")
    println(lambda2)

    //----------------------------------------

    lineLogger {
        println("MSG1")
        println("MSG2")
        println("MSG3")
        println("MSG4")
    }
}


///Lambdas as Function
fun lineLogger(block: () -> Unit) {
    repeat(5) { println("----------")}
    block()
    repeat(5) { println("----------")}
}