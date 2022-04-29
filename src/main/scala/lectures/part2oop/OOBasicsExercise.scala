package lectures.part2oop

object OOBasicsExercise extends App {

  class Writer (firstName: String, surname: String, val yob:  Int){
    def fullName (): String = {
      this.firstName + " " + this.surname
    }
  }

  val murakami = new Writer("Haruki", "Murakami", 1966)

  println(murakami.fullName())
  println(murakami.yob) //cant access firstname and surname individually due to no val

  class Novel (val name: String, val yearOfRelease: Int, author: Writer){ // author is an instance of writer
    def authorAge (writer: Writer): Int = {
      val writerAgeAtRelease =  yearOfRelease - writer.yob
      writerAgeAtRelease
    }

    def isWrittenBy (writer: Writer): Writer = {
      writer
    }

    def copy (novel: Novel, newReleaseYear: Int): Novel = {
      val newInst = new Novel(novel.name, newReleaseYear, author)
      newInst
    }

  }

  val norwegianWood = new Novel("Norwegian Wood", 1989, murakami)

  val newNW = norwegianWood.copy(norwegianWood, 2000)
  println(norwegianWood.name.toString)

  println(newNW.yearOfRelease)

  //COUNTER

  class Counter (recieves: Int) { //rather than define a method to return recieves can just use val ie
    //class Counter( val recieves: Int) {} - val acts as a getter
    //converting a param to a field involves using keyword var/val
    def currentCount = recieves

    def increment(incNum: Int): Int = {
      val incremented  = incNum + recieves
      incremented
    }

    def decrement(decNum: Int): Int = {
      val decremented= decNum + recieves
      decremented
    }

  }

  val count = new Counter(5)
  val hi = count.increment(4)
  println(hi)


  }


