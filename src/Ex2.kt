fun main(args: Array<String>) {

    var obj1 = A()
    obj1.max(88, 6)

}







class A {
    var value : Int = 0

    fun  max (a :Int, b : Int)  {
        if (a  > b)
        {
            this.value = a
            println(this.value)
        }
        else if ( b > a) {
            this.value = b
            println(this.value)
        }
    }
}