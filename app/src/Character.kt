class Character {
  fun main(){
    val letters = 'A' .. 'Z'
    for (letter in letters){
      if(letter.isLetter()){
        println(letter)
      } else {
        println("The letter is not a letter")
      }
    }
  }
}