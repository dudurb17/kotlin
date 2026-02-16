class ConditionalOperator2 {
  fun main(){
    val index = readLine()?.toInt() ?: 0
    val month = when(index){
      0 -> "January"
      1 -> "February"
      2 -> "March"
      3 -> "April"
      4 -> "May"
      5 -> "June"
      6 -> "July"
      7 -> "August"
      8 -> "September"
      9 -> "October"
      10 -> "November"
      11 -> "December"
      else -> "Invalid index"
    }

    if (index in 0 .. 11){
      println("The month is $month")
    } else {
      println("Invalid index")
    }

    val monthActivity = readLine()?.toString() ?: "sunny"
    val activity = when(monthActivity){
      "June", "July", "August" -> "It's summer"
      "September", "October", "November" -> "It's autumn"
      "December", "January", "February" -> "It's winter"
      "March", "Apreil", "May" -> "It's spring"
      else -> "stay home"
    }
    println("The activity is $activity")
  }
}