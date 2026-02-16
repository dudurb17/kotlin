class HappyBirthday {
  fun main(){
    println("Input your age: ")
    val age = readLine()?.toInt() ?: 0

    repeat(age){
      println("Happy Birthday! You are ${it+1} years old.")
    }
  }
}