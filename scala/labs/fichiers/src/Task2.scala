import scala.io.Source._
import scala.io.Source
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
  println(shortestWord)
  //val longWord = contents.maxBy(_.length)
  println(longWord)

  val sayi = io.Source.fromURL(url).getLines
  println(sayi)

  val li = sayi.length
  var comp : Int = 0
  for ( t <- 0 to (li -1))
    comp += 1
  println(comp)


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

