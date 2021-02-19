

data class Emp(var myId: Int,var  myFirstNName: String,var  myLastName:String){

}


fun main(args: Array<String>) {
    val emp = Emp(1,"Mohamed", "Tamer")
    println(emp)
}