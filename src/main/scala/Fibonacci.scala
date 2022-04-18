import scala.annotation.tailrec

object Fibonacci {

  def fibonacci(n: Int): Int = {
    @tailrec
    def fibonacciRecursive(i: Int, last: Int, nextToLast: Int): Int = {
      if (i >= n) last
      else fibonacciRecursive(i + 1, last + nextToLast, last)
    }

    if (n <= 2) 1
    else fibonacciRecursive(2, 1, 1)
  }

}
