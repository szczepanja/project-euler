object Multiplies {

  def sumOfMultiplies(n: Int): Int = (0 until n).filter(n => n % 3 == 0 || n % 5 == 0).sum

}
