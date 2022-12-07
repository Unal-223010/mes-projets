import scala.io.Source._
import scala.io.{BufferedSource, Source}
import sys.process._
import java.io.FileNotFoundException

object Task2 extends App {

  def deneme(url : String) : Unit ={
    var deneme = Source.fromURL(s"$url").getLines
  }


  def read_Url(url: String): Int = {
    var url_name = Source.fromURL(s"$url").getLines.toArray
    var size: Int = url_name.length
    println(size)
    return size
  }

  read_Url("https://marcellus.begincoding.net/101.1/francais.txt")
  val url = "https://marcellus.begincoding.net/101.1/francais.txt"
  val contents = io.Source.fromURL(url).getLines
  val shortestWord = contents.minBy(_.length)

  //val longWord = contents.maxBy(_.length)
  //println(longWord)

  val sayi = io.Source.fromURL(url).getLines
  println(sayi)

  val li = sayi.length
  //var comp : Int = 0
  //for ( t <- 0 to (li -1))
    //comp += 1
  //println(comp)

  val src: BufferedSource = scala.io.Source.fromURL("https://marcellus.begincoding.net/101.1/francais.txt")

  var longest: String = ""
  var shortest: String = ""
  var mostA: String = ""
  var mostACount: Int = 0
  var lines: Int = 0

  for (line <- src.getLines()) {
    if (line.length > longest.length) longest = line
    if (shortest == "" || line.length < shortest.length) shortest = line

    val aCount: Int = line.count(_ == 'a')
    if (aCount > mostACount) {
      mostACount = aCount
      mostA = line
    }

    lines += 1
  }

  println(s"Longest: '$longest'")
  println(s"Shortest: '$shortest'")
  println(s"Most A's: '$mostA'")

  src.close()



}













 /*
  def getLineNumber(fileName: String): Integer = {
    val src = io.Source.fromFile(fileName)
    try {
      src.getLines.size
    } catch {
      case error: FileNotFoundException => -1
      case error: Exception => -1
    }
    finally {
      src.close()
    }
  }

  def getLineNUmber(my_url : String) : Int =




  //Combien de lignes lisez-vous au total dans votre fichier ?
  read_Url(" https://marcellus.begincoding.net/101.1/francais.txt")

}

//returns line number of a file

   */

