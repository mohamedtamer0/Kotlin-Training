package new

fun main() {

    printUserInfo("Mohamed")
    printUserInfo("Mohamed",25)
    printUserInfo("Mohamed",25,"Developer")
    printUserInfo("Mohamed",25,"Developer", "Cairo")

}


fun printUserInfo(name:String){
    println("Name: $name")
}

fun printUserInfo(name:String, age:Int){
    println("Name: $name , Age : $age")
}

fun printUserInfo(name:String, age:Int, job:String){
    println("Name: $name , Age : $age")
}

fun printUserInfo(name:String, age:Int, job:String, aderress:String){
    println("Name: $name , Age : $age")
}
