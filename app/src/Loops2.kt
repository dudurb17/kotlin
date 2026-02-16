class Loops2 {
  fun main(){
    var count = readLine()?.toInt() ?: 0
    while (count > 0){
      println(count)
      count--
    }
    do {
      println("Hello")
      count--
    } while (count > 0)
  }

}