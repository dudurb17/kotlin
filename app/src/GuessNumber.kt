import kotlin.random.Random
class GuessNumber {
  fun main(){
    val correctNumber = Random.nextInt(0, 100)
    var win = false
    while(!win){
    println("Enter number from 0 to 100: ")
    val number = readLine()?.toInt() ?: 0
    if(number < correctNumber){
      println("Your number is lower")
    } else if(number > correctNumber){
      println("Your number is higher")
    } else {
      println("You guessed the number!")
      win = true
    }
    }
  }
}