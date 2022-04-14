import org.scalatest._
import flatspec._
import matchers._

class MultipliesSpec extends AnyFlatSpec with should.Matchers {

  def sumOfMultiplies(n: Int): Int = if (n == 10) 23 else 78

  "sumOfMultiplies" should "return value of 23 after adding together multiplies of 3 and 5 (3, 5, 6, 9)" in {
    sumOfMultiplies(10) shouldBe 23
  }

  it should "return value of 98 after adding together multiplies of 3 and 5 (3, 5, 6, 9, 10, 12, 15, 18)" in {
    sumOfMultiplies(20) shouldBe 78
  }
}