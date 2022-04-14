object Fibonacci {

  def fibonacciSequence(h: Int, n: Int): List[Int] = {
    if (h > 100) {
      Nil
    } else {
      h :: fibonacciSequence(n, h + n)
    }
  }

}
