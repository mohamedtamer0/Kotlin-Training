package old
class Grade(val letter: String, val points: Double, val credits: Double)


class Student2(
    val firstName: String,
    val lastName: String,
    val grades: MutableList<Grade> = mutableListOf(),
    var credits: Double = 0.0) {
    fun recordGrade(grade: Grade) {
        grades.add(grade)
        credits+= grade.credits
    }
}

fun main(args: Array<String>) {
    val jane = Student2(firstName = "Jane", lastName = "Appleseed")
    val history = Grade(letter = "old.B", points = 9.0, credits = 3.0)
    var math = Grade(letter = "old.A", points = 16.0, credits = 4.0)

    jane.recordGrade(history)
    jane.recordGrade(math)
}