class TypesOfVariables {
    var age = 0
    fun requestAge() {
        println("Input your age: ")
        age = readLine()?.toInt() ?: 0
    }

    fun main() {
        val name:String = "John"
        requestAge()
        val isStudent:Boolean = true
        println("Name: $name \nAge: $age \nIs Student: $isStudent")
    }
}