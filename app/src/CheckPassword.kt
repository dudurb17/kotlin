class CheckPassword {
  fun main(){
    println("Input your password: ")
    val password = readLine()?.toCharArray() ?: charArrayOf()
    var containsLetter = false
    var containsDigit = false
    var containsSpecialSymbol = false
    for (symbol in password){
      if(symbol.isLetter()){
        containsLetter = true
      }
      if( symbol.isDigit()){
        containsDigit = true
      }
      if(!symbol.isLetter() && !symbol.isDigit()){
        containsSpecialSymbol = true
      }
    }
    if(containsLetter && containsDigit && containsSpecialSymbol && password.size >= 8){
      println("Password is valid")
    } else {
      println("Password is invalid")
    }
  }
}