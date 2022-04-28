package lectures.part1basics

object CBNvsCBV extends App {

  def calledByValue(x: Long): Unit = {
    println("by value " + x) //println("by value " + 276090285953958L)
    println("by value " + x) //println("by value " + 276090285953958L)
  }

  def calledByName(x: => Long): Unit = {
    println("by name " + x) //println("by value " + System.nanotime())
    println("by name " + x) //println("by value " + System.nanotime())
  }

  calledByValue(System.nanoTime()) //exact value is computed before function evaluates, ie evaluates nanotime and uses it throughout entire function
  calledByName(System.nanoTime()) //nanotime is evaluated two different times, results in two different times

  //call by value - computed before it is called, same value is used throughout entire function
  //call by name - the paramater passed in is not a value, but an expression, the expression is evaluated as every use within the function


}
