import java.io.FileNotFoundException
import scala.io.Source
import scala.io.Source._
object Task1 extends App {
  def readFile(filename: String): Array[String] = {
    //val fileName: String = "test.txt"
    val lines = Source.fromFile(s"$filename").getLines.toArray
    for (i <- lines.indices)
      System.out.println(lines(i))
    return lines
  }

  readFile("res/drawingTest.csv")

  try {
    //var file_exp1 = readFile("test.pdf")
    //var file_exp2 = readFile("res/test.pdf")
    readFile("res/test.txt")
    readFile("test.pdf")

  }
  catch {
    case e : FileNotFoundException =>
      println("Exception: File missing")
  }
}

