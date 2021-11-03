package new

import java.lang.Thread.sleep
import kotlin.random.Random


fun main() {
    val name:String by lazy {
        println("Computed")
        sleep(900)
        "Tamer"
    }

    println(name)
    println(name)
    println(name)



    //Lazy Initializer Block
    val result = lazy { someExpOperation() }
    println(result)
    println("Is Initialized: ${result.isInitialized()}")
    println(result.value)
    println(result.value)
    println(result.value)



}

/// Lazy Initializer Block
fun someExpOperation():Int{
    println("Computed")
    sleep(900)
    return Random(System.currentTimeMillis()).nextInt()
}