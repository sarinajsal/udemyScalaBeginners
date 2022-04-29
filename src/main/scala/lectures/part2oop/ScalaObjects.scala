package lectures.part2oop

object ScalaObjects extends App {
  //scala does not have class level functionality (or "static")
  //objects are defined in a similar way to classes, BUT they do not recieve params (ie can create vals,vars,defs and acces
  object Person{// when you define object Person you define its type + its only instance //object is its own type, person
    //"static"/"class" level functionality
    val N_EYES =2
    def canFly: Boolean = false

    //factory method
    def apply(mother: Person, father: Person): Person = new Person("child")
  }

  class Person (val name: String){
    //instance -level functionality
    //pattern of writing classes and objects with the same name in the same scope is called COMPANIONS
  }

  //access either a class instance or an object singleton instance

  println(Person.N_EYES)
  println(Person.canFly)
  val mary = new Person("mary")
  val john = new Person("john")

  //scala object = SINGLETON INSTANCE

  val child = Person.apply(mary, john)


  //scala Applications = scala object with
  //def main(args: Array[String]): Unit

  //TAKE AWAYS
  //Scala doesnt have static values/methods
  //instead it has SCALA OBJECTS - are in their own class - the only instance of their class
}
