object FizzBuzz {
  def generate(number: Int): String = {
    (1 to number)
      .map(fizzBuzzNumber)
      .mkString(", ")
  }

  def fizzBuzzNumber(number: Int): String = {
    if (number % 3 == 0 && number % 5 == 0) "FizzBuzz"
    else if (number % 3 == 0) "Fizz"
    else if (number % 5 == 0) "Buzz"
    else number.toString
  }
}
