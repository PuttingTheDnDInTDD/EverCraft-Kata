import org.specs2.mutable._
import org.specs2.specification._

/**
 * Read more about Specs2 at:
 *
 * http://etorreborre.github.com/specs2/
 * http://etorreborre.github.com/specs2/guide/org.specs2.UserGuide.html
 */
class FizzBuzzSpec extends Specification {

  trait context extends Scope {
    val fb = new FizzBuzz()
  }

  "The FizzBuzzer" should {
    
    "return 1,2 for 2" in new context {
      fb.doIt(2) must_== "1, 2"
    }

    // insert more specs here


    "return FizzBuzz up to 100" in new context {
      val hundred = "1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz, 16, 17, Fizz, 19, Buzz, Fizz, 22, 23, Fizz, Buzz, 26, Fizz, 28, 29, FizzBuzz, 31, 32, Fizz, 34, Buzz, Fizz, 37, 38, Fizz, Buzz, 41, Fizz, 43, 44, FizzBuzz, 46, 47, Fizz, 49, Buzz, Fizz, 52, 53, Fizz, Buzz, 56, Fizz, 58, 59, FizzBuzz, 61, 62, Fizz, 64, Buzz, Fizz, 67, 68, Fizz, Buzz, 71, Fizz, 73, 74, FizzBuzz, 76, 77, Fizz, 79, Buzz, Fizz, 82, 83, Fizz, Buzz, 86, Fizz, 88, 89, FizzBuzz, 91, 92, Fizz, 94, Buzz, Fizz, 97, 98, Fizz, Buzz"
      fb.doIt(100) must_== hundred
    }.pendingUntilFixed

  }

}
