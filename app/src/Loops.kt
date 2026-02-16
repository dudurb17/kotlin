class Loops{
  fun main(){
    val names  = listOf<String>("Eduardo", "Nadia", "Fernando", "Renato")
    println("Enter name: ")
    val searchName = readLine()?.toString() 
    var nameFound = false
    var index = 0
    while(index<names.size){
      if(searchName == names[index]){
        nameFound = true
        break;
      }
      index++
    }

    if(nameFound){
      println("Name found")
    }else{
      println("Name not found")
    }

    for(name in names){
      if(name == searchName){
        nameFound = true
        break
      }
    }

    if(nameFound){
      println("Name found")
    }else{
      println("Name not found")
    }
   }
}