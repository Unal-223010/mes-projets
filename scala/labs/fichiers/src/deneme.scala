import java.io.FileNotFoundException
import scala.io.Source
import scala.io.Source._

object deneme extends App {

  val lines = Source.fromFile("res/test.pdf").getLines
  // getlines satir halinde getiriyor.
  val lines_size : Int = lines.length
  println(lines_size)





}
