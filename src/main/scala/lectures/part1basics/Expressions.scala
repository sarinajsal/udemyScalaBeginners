package lectures.part1basics

object Expressions extends App {

  val x = 1 + 2 // right side is an expression - are evaluated to a value and have a type

  // + - * / & | ^ << >> >>>(right shift with zero extension)

  //relational operations - test equality
  // == != > >= < <+

  //boolean operators
  //! && ||

  var aVar = 2
  aVar += 3 //equates to 5
  //changing a variable is a SIDE EFFECT

  //Instructions (DO) vs Expressions (VALUE)
  //instructions are when you tell the computer to DO something eg change a variable, print to console
  //expressions have a value and a type
  //in scala - think in values, every bit of code has a value

  //IF
  val aCondition = true
  val aConditionedValue = if (aCondition) 5 else 3 //if EXPRESSION gives value of 5 if true
  println(aConditionedValue)

  var i = 0
  while (i < 10) {
    println(i)
    i += 1
  } //dont do this dont write imperitive code

  //EVERYTHING IN SCALA IS AN EXPRESSION

  val aWeirdValue = (aVar = 3) //Unit === void
  println(aWeirdValue)

  //side effects in scala are expressions that return unit
  //side effects: println(), whiles, reassigning

  //code blocks
  val aCodeBlock = {
    val y = 2
    val z = y + 1

    if (z > 2) "hello" else "goodbye" //the value of the block is the value of the last expression
  }
  //nb a code block can have its own definition of values
  //val anotherVal = z +1 - compiler complains 

}
