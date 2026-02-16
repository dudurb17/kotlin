class Calculator {
  fun main(){
    // println("Input the first number: ")
    // val a = readLine()?.toDouble() ?: 0.0
    // println("Enter symbol: (+, -, *, /)")
    // val symbol = readLine()?.toString() ?: ""
    // println("Input the second number: ")
    // val b = readLine()?.toDouble() ?: 0.0

    println("Enter the expression (e.g. 1 + 2): ")
    val expression = readLine()?.toString() ?: ""
    val parts = expression.split(" ")
    val a = parts[0].toDouble()
    val symbol = parts[1]
    val b = parts[2].toDouble()
    when(symbol){
      "+" -> println("The sum of $a and $b is ${a + b}")
      "-" -> println("The difference of $a and $b is ${a - b}")
      "*" -> println("The product of $a and $b is ${a * b}")
      "/" -> println("The quotient of $a and $b is ${a / b}")
      else -> println("Invalid symbol")
    }


    
  }
}