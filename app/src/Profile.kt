class Profile {
  var name = ""
  fun requestProfile() {
    println("Requesting profile...")
    println("Input your name: ")
    name = readLine() ?: ""

  }

    fun main() {
        println("Hello, profile! $name") 
    }
}