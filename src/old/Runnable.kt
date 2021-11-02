package old

class HP2 : Runnable {

    override fun run() {
        for (i : Int in 0 until 5) {
            println("old.HP2")
            Thread.sleep(1000)
        }
    }
}

class DELL2 : Runnable{

    override  fun run() {
        for (i : Int in 0 until 5) {
            println("old.DELL2")
            Thread.sleep(1000)
        }
    }
}



fun main(args: Array<String>) {
    var objH : Runnable = HP2()
    var objD : Runnable = DELL2()
    var t1 = Thread(objH)
    var t2 = Thread(objD)

    t1.start()
    Thread.sleep(500)
    t2.start()
}