class Division {
  var a: Int = 0
  var b: Int = 0
  private fun requestNumbers() {
    println("Input the first number: ")
    a = readLine()?.toInt() ?: 0
    println("Input the second number: ")
    b = readLine()?.toInt() ?: 0
  }


  private fun showResult() {
    println("The division of $a / $b is ${a / b}")
    println("The remainder of the division of $a % $b is ${a % b}")
  }
    fun main() {
        requestNumbers()
        showResult()
    }
}