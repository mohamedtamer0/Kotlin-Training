package old

fun main(args: Array<String>) {

    var objBMW = BMW()
    var objTOYOTA = TOYOTA()

    objBMW.name = "old.BMW X6"
    objBMW.model = 2017
    objBMW.speed = 250
    objBMW.carInfo()

    println("--------------------------------")

    objTOYOTA.name = "Camry"
    objTOYOTA.model = 2016
    objTOYOTA.speed = 280
    objTOYOTA.carInfo()

}


