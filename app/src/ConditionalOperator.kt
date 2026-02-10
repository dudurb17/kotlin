class ConditionalOperator {
  fun main() {
      val temperature = readLine()?.toInt() ?: 0
      if(temperature > 25){
        println("The temperature is greater than 25 degrees")
      } else {
        println("The temperature is less than or equal to 25 degrees")
      }
  }
}