package lectures.part1basics

object ValuesVariablesTypes extends App {

  val x: Int = 42 //types of vals are optional, compiler infers that 42 is an int
  val y = 3 //inferred
  println(x)

  //vals cannot be reassigned/ are immutable

  val aString: String = "hello";
  val anotherString = "goodbye" //not recommended

  val aBool: Boolean = true
  val aChar: Char = 'a'
  val anInt: Int = 1
  val aShort: Short = 4123
  val aLong: Long = 23423423424L
  val aFloat: Float = 2.0F
  val aDouble: Double = 3.12

  //variables
  var aVar: Int = 4
  aVar = 5 //side effects eg printing to console, displaying something on screen

  //prefer vals

}
