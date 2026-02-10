class WhatToDo {

  fun main(){
    println("How much money do have?:")
    val countOfMoney = readLine()?.toInt() ?: 0
    println("Are you hungry? true/false")
    val hungry = readLine()?.toBoolean() ?: false

    if(countOfMoney > 500 && hungry){
      println("Buy a pizza")
    }else if (countOfMoney >= 500 && hungry){
      println("Buy some instant noodles")
    }else if(countOfMoney > 500 ){
      println("Go to the cinema")
    }else {
      println("Go to the park")
    }
  }


}