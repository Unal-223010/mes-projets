import scala.io.Source
import scala.io.Source._

object splitd extends App {

  var file_2 = Source.fromFile("res/drawingTest.csv").getLines().toArray
  //file_2.foreach(println)

  for((a,b) <- file_2.zipWithIndex) {
    println(s"The $b element array is $a")
    //println(a.getClass)
    //println(b.getClass)
  }

  var file_2_length = file_2.length
  println(file_2_length)

  val days = Array("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday")
  days.zipWithIndex.foreach {
    case (day, count) => println(s"$count is $day")


  }



}
