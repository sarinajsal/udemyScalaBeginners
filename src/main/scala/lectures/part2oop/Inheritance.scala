package lectures.part2oop

object Inheritance extends App{

  //single class inheritance
  class Animal { //superglass
    val creatureType = "wild"
  def eat = println("nom")
  }

  class Cat extends Animal { //subclass - only inherits non private members of the superclass
  def crunch = {
    eat
    println("crunch crunch") //protected method eat only accessible within extended classes
  }
  }
  val cat = new Cat
  //cat.eat cant be called instead..
  cat.crunch //uses eat method


  //constructors
  class Person(name:String, age:Int) {
    def this(name:String) = this(name, 0)
  }
  class Adult(name: String, age: Int, idCard: String) extends Person(name, age) //defining a class like this with a signiture also defines its constructor

  //overriding
  class Dog (override val creatureType: String) extends Animal { //override can be used in the constructor too
    //override val creatureType: String = "domestic"
    override def eat = {
      super.eat //refers to superclass method nom
      println("cronch")
    }
  }

  val dog = new Dog ("k9")
  dog.eat
  println(dog.creatureType)

  //type substitution (broad polymorphism)
  val unknownAnimal: Animal = new Dog("k9") //uses the dog version of .eat, not animal, a method call goes to the most overriden version
  unknownAnimal.eat

  //overriding(supplying a different implemetation in derived calsses
  //overloading(supplying multiple methods with different signitures, but with same name in same class

  //super

  //preventing overrides
  //1- use final keyword to prevent derrived classes from overriding methods
  //2- use on superclass (entire class can not be extended)
  //3- seal the class using "sealed"= extend class in THIS FILE, cant be extended in another file 

}
