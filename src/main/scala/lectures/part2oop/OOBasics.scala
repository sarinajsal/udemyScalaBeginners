package lectures.part2oop

import java.io.Writer
import java.time.LocalDate

object OOBasics extends App {

  val person = new Person("john", 26)
  println(person.age)
  println(person.x)
  person.greet("sarina")

}
//cant be accessed with . method
//class parameters are not fields - this can be changed by adding the val or var keywords eg val age:Int
class Person (name: String, val age:Int) { //the constructor, age is a class parameter, but not a class member
  //body, can contain val and var definitions, function definitions(methods), expressions, val of code block is ignored

  val x = 2
  println(1+3)
  //at every instanciation of class person, the entire body block of code is evaluated (all expressions and side effects)

  //method
  def greet (name:String): Unit = println(s"${this.name} says: hi $name") //this.name refers to the name parameter of class person


  //OVERLOADING - defining methods with the same name but different signatures
  def greet(): Unit = println(s"Hi i am $name") //in this case name is essentially ${this.name} but the this. is implied

  //MULTIPLE CONSTRUCTORS - done by using 'def this'

  def this(name: String) = this (name, 0)
  def this() = this ("John doe")




 
}



