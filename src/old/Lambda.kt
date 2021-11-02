package old//fun old.main(args: Array<String>) {
//
//    val printMSG = {message: String -> println(message)}
//
//    printMSG("Hello World")
//
//    val sumA = {x  : Int, y: Int -> x + y}
//    println(sumA(5, 6))
//
//
//    val sumB : (Int,Int) -> Int = {x,y -> x + y}
//
//    fun downloadData(url : String, completion: ()-> Unit) {
//        // Sent a download request
//        // We got back data
//        // there were no netWork errors
//        completion()
//    }
//
//    //call downloadDataFunction
//    downloadData("fakerUrl.com") {
//        println("The code in this block , will ony run " + "after the completion()")
//    }
//
//
//    fun  downloadCarData (Url : String, completion: (car) -> Unit) {
//        val car  = car("Tesla", "Model X", "Blue")
//        completion(car)
//    }
//
//    downloadCarData("fakerUrl.com") {
//        println(it.color)
//        println(it.make)
//    }
//
//    fun downloadTruckData(url :String, completion: (Truck?, Boolean)-> Unit){
//
//        val webRequestSuccess = false
//        if (webRequestSuccess) {
//            val truck = Truck("Ford", "150", 10000)
//            completion(truck, true)
//        }else
//        {
//            completion(null, false)
//        }
//
//    }
//
//    downloadTruckData("fakerUrl.com") {truck, success ->
//        if (success == true) {
//        truck?.tow()
//        }else {
//            println("Wrong!")
//        }
//    }
//
//
//}