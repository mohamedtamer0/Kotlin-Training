class NestedClass {

    class one {
        var y : Int? = null
        fun printOne(){

        }
    }

    var x : Int? =null
    fun printNestedClass() {

    }

}


fun main(args: Array<String>) {
    var objA = NestedClass()
    var objB = NestedClass.one()

    objB.printOne()
}