package old

class BMW : Car {
    constructor(){

    }

    override fun carInfo() {
        println("Name Is : ${super.name}")
        println("Model Is : ${super.model}")
        println("Speed Is : ${super.speed}")
    }

}