package lectures.part1basics

object Functions extends App {

  def aFunction(a: String, b: Int): String = {
    a + " " + b //string concatanation
  }

  println(aFunction("hello", 3)) //you call a function by naming it and passing in parameter values

  def aParameterlessFunction(): Int = 42

  println(aParameterlessFunction())

  def aRepeatedFunction(aString: String, n: Int): String = {
    if (n == 1) aString
    else aString + aRepeatedFunction(aString, n - 1) //a recusrive function as it calls itself
  }

  println(aRepeatedFunction("hello", 3))
  //in a functional language you use recursive functions

  //compiler can figure out return types of functions you dont specify, BUT you need a return type for recursive functions

  def aFunctionWithSideEffects(aString: String): Unit = println(aString)

  def aBigFunction(n: Int): Int = {
    def aSmallerFunction(a: Int, b: Int): Int = a + b

    aSmallerFunction(n, n - 1) //the return expression of the big function
  }

  //exercise
  def greeting(name: String, age: Int): String = {
    s"hi my name is $name and i am $age years old"
  }

  println(greeting("sarina", 23))

  def factorial(n: Int): Int = {
    if (n == 1) 1
    else n * factorial(n - 1)

  }

  println(factorial(5))

  def fibonnaci(n: Int): Int = {
    if (n <= 1) n
    else
      fibonnaci(n - 1) + fibonnaci(n - 2)


  }

  println(fibonnaci(6))

  def isPrime(aNum: Int): Boolean = {
    def primeUntil(t: Int): Boolean = //an auxillary function that goes through all integer numbers starting from n/2
      if (t <= 1) true
      else aNum % t != 0 && primeUntil(t - 1)

    primeUntil(aNum / 2)
  }

  println(isPrime(7))

}
