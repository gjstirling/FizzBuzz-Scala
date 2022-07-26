object FizzBuzz {
  def generate(number: Int): String = {
    var a = 0;
    var fizzBuzzArray = Array[String]()
    for( a <- 1 to number){
      fizzBuzzArray = fizzBuzzArray :+ a.toString
    }
    var arrayString = fizzBuzzArray.mkString(", ")
    arrayString
  }
}
