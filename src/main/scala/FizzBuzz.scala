object FizzBuzz {
  def generate(number: Int): String = {
    var a = 0;
    var fizzBuzzArray = Array[String]()
    for( a <- 1 to number){
      fizzBuzzArray = fizzBuzzArray :+ checkNumber(a)
    }
   fizzBuzzArray.mkString(", ")
  }

  def checkNumber(number: Int): String = {
    if (number % 3 == 0) {
      "Fizz"
    }
    else {
      number.toString
    }
  }
}
