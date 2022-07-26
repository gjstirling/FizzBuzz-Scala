object FizzBuzz {
  def generate(number: Int): String = {
    var a = 0;
    var fizzBuzzArray = Array[String]()
    for( a <- 1 to number){
      fizzBuzzArray = fizzBuzzArray :+ fizzBuzzNumber(a)
    }
   fizzBuzzArray.mkString(", ")
  }

  def fizzBuzzNumber(number: Int): String = {
    if (number % 3 == 0 && number % 5 == 0) "FizzBuzz"
    else if (number % 3 == 0) "Fizz"
    else if (number % 5 == 0) "Buzz"
    else number.toString
  }
}
