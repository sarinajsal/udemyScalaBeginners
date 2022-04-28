package lectures.part1basics

import scala.annotation.tailrec

object Recursion extends App {

  def factorial(n: Int): Int = {
    if (n <= 1) 1
    else {
      println("computing factorial of" + n + " i first need factorial of " + (n - 1))
      val result = n * factorial(n - 1)
      println("computed factorial of " + n)
      result
    }
  }

  println(factorial(5))
  //println(factorial(5000)) will give stackoverflow error

  def anotherFactorial(n: Int): BigInt = {
    def factorialHelper(x: Int, accumulator: BigInt): BigInt =
      if (x <= 1) accumulator
      else factorialHelper(x - 1, x * accumulator)

    factorialHelper(n, 1)
  }

  /**
   * anotherFactorial(10) = factHelper(10,1)
   * = factHelper(9, 10 * 1)
   * = factHelper(8, 9 * 10 * 1)
   * = factHelper(7, 8 * 9 * 10 * 1)
   * = ...
   * =factHelper(2, 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10)
   * =factHelper(1, 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10)
   */

  //when you need loops, use tail recursion

  //string concatanation n times

  //  def stringConcatToN (ostring: String, n: Int): String = {
  //    def stringPlus (accumulate: String): String =
  //      if (n <= 1) ostring
  //      else ostring+ostring
  //    stringPlus(ostring+ostring)
  //  println(ostring)
  //    stringConcatToN(ostring, n-1)
  //
  //  }


  //each time it runs the function, one "hi" is added and 1 is taken from n
  @tailrec
  def stringConcat(aString: String, n: Int, accumulates: String): String = {
    if (n <= 0) accumulates
    else stringConcat(aString, n - 1, aString + accumulates)

  }

  println(stringConcat("hi", 3, " "))

  def isAPrime(n: Int): Boolean = {
    def isPrimeTailRec(t: Int, isStillPrime: Boolean): Boolean =
      if (!isStillPrime) false
      else if (t <= 1) true
      else isPrimeTailRec(t - 1, n % t != 0 && isStillPrime)

    isPrimeTailRec(n / 2, true)
  }


}
