package old

class CircleIInterface : Drawable {

    private var radius :Double? = null

    constructor(p_radius :Double) {
        this.radius = p_radius
    }

    override fun draw(color: String) {
        println("Drawing circle ... Color shape$color")
    }

    override fun getArray(): Double {
        return Math.PI * this.radius!! * this.radius!!
    }


}

class Rectangle : Drawable {

    private var width :Double? = null
    private var height: Double? = null

    constructor(p_width: Double, p_height : Double ){
        this.width = p_width
        this.height = p_height
    }

    override fun draw(color: String) {
        println("Drawing old.Rectangle ... Color shape$color")
    }

    override fun getArray(): Double {
        return this.width!! * this.height!!
    }

}


class Square : Drawable {

    private var l : Double? = null

    constructor(p_l : Double){
        this.l = p_l
    }

    override fun draw(color: String) {
        println("Drawing old.Square ... Color shape$color")
    }

    override fun getArray(): Double {
        return 2 * l!!
    }

}


fun main(args: Array<String>) {
    var obj1 = CircleIInterface(5.3)
    obj1.draw("RED")
    var r_circle = obj1.getArray()
    println("old.Circle area ${r_circle}")

}



