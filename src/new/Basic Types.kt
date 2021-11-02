package new

fun main() {

    val myByte: Byte = 8 //8-bit signed integer
    val short: Short = 16 // 16-bit signed integer
    val myInt: Int = 32 // 32-bit signed integer
    val myLong: Long = 64 //64-bit signed integer

    // decimals
    val myFloat: Float = 32.00F //32-bit floating point number
    val myDouble: Double = 64.00 //64-bit floating point number

    println(myByte.toDouble()::class)

    val bigLong: Long = 1_000_000_000
    println(bigLong)

    val newInt = myInt.times(12)
    println(newInt)


    // Basic Types: String and Char
    val fullName = "Mohamed Tamer"
    println(fullName.length)
    println(fullName.decapitalize())
    println(fullName.capitalize())
    println(fullName.toUpperCase())
    println(fullName.toLowerCase())

    // Char
    val c: Char = 't' // 16-bit Unicode Character


    // String Interpolation and Triple Quotes
    var msg: String = """
        Hello,
        World.
        My Name Is : 
        Mohamed Tamer
    """.replaceIndent("* ")

    println(msg)


    val myName = "Mohamed Tamer"
    val myAge = 25
    println("Hello My Name is : $myName And My Age Is : $myAge")



    // Basic Types: Boolean

    var isBlank:Boolean = false
    println(isBlank)

    isBlank = "Tamer".isBlank()
    println(isBlank)





}