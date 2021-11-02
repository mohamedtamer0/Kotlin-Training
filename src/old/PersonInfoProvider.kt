package old

interface PersonInfoProvider {
    val providerInfo : String

    fun printInfo(person: Person) {
        println(providerInfo)
        person.printInfo()
    }
}

interface SessionInfoProvider {
    fun getSessionId() : String
}


open class BasicInfoProvider : PersonInfoProvider, SessionInfoProvider {
    override val providerInfo: String
        get() = "old.BasicInfoProvider"

    protected open val sessionIdPrefix = "Session"

    override fun printInfo(person: Person) {
        super.printInfo(person)
        println("additional print statement")
    }

    override fun getSessionId(): String {
        return sessionIdPrefix
    }

}

fun main() {
    val provider = object : PersonInfoProvider {
        override val providerInfo: String
            get() = "New Info Provider"

        fun getSessionId() = "id"
    }

    provider.printInfo(Person())
    provider.getSessionId()
    checkType(provider)
}

fun checkType(infoProvider: PersonInfoProvider) {
    if (infoProvider is SessionInfoProvider) {
        println("Is a Session Info Provider")
    } else {
        println("Not a Session Info Provider")
    }
}
