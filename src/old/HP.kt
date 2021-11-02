package old

class HP : Thread {
    constructor()
   override fun run() {
        for (i : Int in 0 until 5) {
            println("old.HP")
            Thread.sleep(1000)
        }
    }
}

class DELL : Thread{
    constructor()
  override  fun run() {
        for (i : Int in 0 until 5) {
            println("old.DELL")
            Thread.sleep(1000)
        }
    }
}



fun main(args: Array<String>) {
    var objH = HP()
    var objD = DELL()
    objH.start()
    Thread.sleep(500)
    objD.start()
}