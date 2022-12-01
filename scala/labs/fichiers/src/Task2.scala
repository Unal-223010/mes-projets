import scala.io.Source._
import scala.io.Source
import sys.process._
import java.io.FileNotFoundException

object Task2 extends App {

  def read_Url(url: String): Int = {
    var url_name = Source.fromURL(s"$url").getLines.toArray
    var size : Int = url_name.length
    println(size)
    return size
  }

  def short_url(url:String) : String = {
    var url_name = Source.fromURL(s"$url").getLines.toArray
    var first : String = ""
    for(a<- url_name.indices)
      for(b<- url_name(a))
        //Devam buradan en kisa kelimeyi bulmaya calisiyorsun


  }
  read_Url("https://marcellus.begincoding.net/101.1/francais.txt")
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

