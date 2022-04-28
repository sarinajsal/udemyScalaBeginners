package lectures.part1basics

object DefaultArgs extends App {

  def savePicture(format: String = "jpeg", width: Int = 1920, height: Int = 1080): Unit = println("saving pic")
  //args are made default by equating them
  savePicture(width = 900)
  savePicture(height = 600, width = 1000, format = "gif")
  //name the args to reassign if you have made them default 

  //

}
