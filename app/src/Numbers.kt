class Numbers {
  fun main(){
    val numbers = listOf(12, 23, 34, 45, 56, 67, 78, 89, 90)
    for (number in numbers){
      if(number % 2 == 0){
        println("Even number: $number")
      }else{
        println("Odd number: $number")
      }
    }
  }
}