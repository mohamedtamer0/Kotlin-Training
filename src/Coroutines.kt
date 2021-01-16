import kotlin.concurrent.thread


fun main(args: Array<String>) {
    thread(start = true, name = "Another thread") {
        (0..10).forEach{
           println ("Message #$it  from ${Thread.currentThread().name}")
        }
    }

    (0..10).forEach{
        println ("Message #$it  from ${Thread.currentThread().name}")
    }




}