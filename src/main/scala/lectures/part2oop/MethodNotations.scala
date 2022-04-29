package lectures.part2oop

object MethodNotations extends App {

  class Person(val name: String, val favMovie: String){
    def likes(movie: String): Boolean = movie == favMovie
    def +(person: Person): String = s"${this.name} is hanging out with ${person.name}"
    def unary_! : String = s"$name what the heck"
    def isAlive: Boolean = true
    def apply(): String = s"hi my name is $name and i like $favMovie"
    //exercises
    def + (nickname: String): Person = new Person(s"$name ($nickname)", favMovie)
  }


  val mary = new Person("Mary", "Inception")
  println(mary.likes("Inception"))
  println(mary likes "Inception") //equivalent
  //in fix notation = operator notation - only works w methods that have one param

  //"operators" in scala

  val tom = new Person("Tom", "FightClub")
  println(mary + tom) //hangoutwith acts like an operator eg + - > etc

  println(1+2)
  println(1.+(2)) //all operators are actually methods

  //prefix notation

  val x = -1
  val y = 1.unary_- //equivalent
  //unary_prefix only works with - + ~ !

  println(!mary)
  println(mary.unary_!)

  //postfix notation
  println(mary.isAlive)
//  println(mary isAlive) - only avaialable to methods without params

  //apply
  println(mary.apply())
  println(mary())//equivalent -when compiler sees object being called like a function

  println(mary + "the rockstar")
}
