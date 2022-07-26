import org.scalatest.funsuite.AnyFunSuite

class FizzBuzzTest extends AnyFunSuite {
  test("lists the numbers up to one") {
    assert(FizzBuzz.generate(1) === "1")
  }

  test("lists the numbers up to two") {
    assert(FizzBuzz.generate(2) === "1, 2")
  }

  test("replaces 3 with Fizz") {
    assert(FizzBuzz.checkNumber(3) === "Fizz")
  }

  test("replaces 5 with Buzz") {
    assert(FizzBuzz.checkNumber(5) === "Buzz")
  }

}
