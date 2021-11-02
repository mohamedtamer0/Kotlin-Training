package old
@Deprecated("you can use old.Cat class", ReplaceWith("old.Cat"))
class Dog (var name: String, var lastName: String) {
    init {
        println("My old.First Name: $name and last name: $lastName")
    }
}

fun main(args: Array<String>) {
    var dog = Dog("dog","dog")
    dog

    var cat = Dog("dog","dog")
    cat
}