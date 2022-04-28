package lectures.part1basics

object StringOps extends App {

  val str: String = "Hello, I am learning scala"
  println(str.charAt(2))
  println(str.substring(7, 11)) //7 inclusive, 11 exclusive
  println(str.split(" ").toList)
  println(str.startsWith("Hello"))
  println(str.replace(" ", "-"))
  println(str.toLowerCase())
  println(str.length) //all java functions available to scala

  val aNumberString = "45"
  val aNumber = aNumberString.toInt
  println('a' +: aNumberString :+ 'z')
  println(str.reverse)
  println(str.take(2))

  //scala-specific: string interpolators

  //s-interpolaters
  val name = "David"
  val age = 12
  val greeting = s"Hello, my name is $name and Im $age years old"
  val anothergreeting = s"Hello, my name is $name and I will be turning ${age + 1} years old"
  println(anothergreeting)

  //F-interpolators
  val speed = 1.2f
  val myth = f"$name can eat $speed%2.2f burgers per minute" //2 characters min and 2 decimals precision
  print(myth)

  //raw-interpolator - ignores escaped characters
  println(raw"This is a \n newline")
  val escaped = "This is a \n newline"
  println(raw"$escaped")
}
