class CombineOperators {

  fun main(){
    println("The weather is good? true/false")
    val isGoodWeather = readLine()?.toBoolean() ?: false
    println("What time is it?")
    val time = readLine()?.toInt() ?: 0
    val isDay = time < 22 && time > 5

  if (isDay && isGoodWeather){
    println("Go for a walk")
   } else if (isDay && !isGoodWeather) {
    println("Stay home")
   } else {
    println("Go to sleep")
   }
  }
}