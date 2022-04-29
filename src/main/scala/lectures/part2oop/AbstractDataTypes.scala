package lectures.part2oop

object AbstractDataTypes extends App{

  //abstract
  abstract class Animal { //values not supplied for val and method ie you want subclasses to do that for you
    val creatureType: String = "wild" //abstract classes can have both abstract and non abstract stuff
    def eat:Unit
  }

  class Dog extends Animal{
    override val creatureType: String = "k9"
    override def eat: Unit = println("crunch crunch")
  }

  //traits
  trait Carnivore{ //like abstract classes traits by default have abstract fields/methods
    def eat(animal: Animal): Unit
    val preferredMeal: String = "fresh meat"
  }

  class Crocodile extends Animal with Carnivore{
    override val creatureType: String = "croc"
    override def eat: Unit = "nomnomnom"
    override def eat(animal: Animal): Unit = println(s"Im a croc and Im eating ${animal.creatureType}")
  }

  val dog = new Dog
  val croc= new Crocodile
  croc.eat(dog)


  //traits vs abstract classes
  //traits do not have constructor parameters
  //can only extend one class, but can mix in multiple traits in the same class
  //traits are behavior, abstract class is a thing (ie animal is a class, traits describe what the class does (ie carnivore))

}
