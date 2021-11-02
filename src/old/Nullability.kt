package old

fun main() {
    val name2 : String = "Tamer"


    val nullableName : String? = "???????????"
    //nullableName = null

    var length = 0
    if (nullableName != null) {
        length = nullableName.length
    }else {
        length = -1
    }
    println(length)

    val l = if (nullableName != null) nullableName.length else -1

    println( nullableName?.length)



    class Grade(val letter : String, val points: Double, val credits: Double)

    class Student (
            val firstName: String,
            val lastName: String,
            val grades: MutableList<Grade> = mutableListOf(),
            var credits: Double = 0.0) {
        fun recordGrade(grade: Grade) {
            grades.add(grade)
            credits += grade.credits
        }
    }

    val jane = Student(firstName = "Tamer", lastName = "Mohamed")
    val history = Grade(letter = "old.B", points = 9.0, credits = 3.0)
    val math = Grade(letter = "old.A", points = 16.0, credits = 5.0)

    jane.recordGrade(history)
}