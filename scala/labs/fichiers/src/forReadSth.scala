import java.util.Scanner
import scala.io.Source
import scala.io.Source.fromURL
import java.io.FileInputStream
import java.io.File


object forReadSth extends App {

  val readUrl = Source.fromURL("https://marcellus.begincoding.net/101.1/francais.txt").getLines()
  var taille  = System.out.println(readUrl.length)
  /*
  val longestWord = readUrl.maxBy(_.length)
  println(longestWord)
   CALISMIYOR...
   */

  //val readFILE = Source.fromFile("res/drawingTest.csv").getLines
  //readFILE.foreach(println)

  val url = "https://marcellus.begincoding.net/101.1/francais.txt"
  lazy val contents = io.Source.fromURL(url).getLines.toList
  val shortestWord = contents.minBy(_.length)
  val longestWord = System.out.println(contents.maxBy(_.length))

}
