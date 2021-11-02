package old

import kotlin.Any

open class First {

}

class Second : First {
    constructor()
}



class Any {

    companion object {
        fun show(any :Any) {

        }

        fun returnShow() : Any {
            var objF = First()
            return objF

            var objS = Second()
            return objS


        }



    }


}


