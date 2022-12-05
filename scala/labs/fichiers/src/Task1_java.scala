package content
import java.io.File
import java.util.Scanner
import scala.io.Source
import scala.reflect.io
import scala.io.Source._

object Task1_java extends App {

  // Java kullanarak scalada file okuma
  val filePath_1: String = "C:/Users/ted/Desktop/mes-projets/scala/labs//fichiers/res/nums.txt"
  // Read file with Java way
  val file_1 = new File(filePath_1) // File yazdiktan sonra java.io sectin
  // This is a file_1 object.
  // Now we can read data from this file by creating scanner.
  val scanner_1 = new Scanner(file_1) // Bununda yazinca yukarida otomatik import ediyor,neyi sectigini oradanda gorebilirsin.
  // Constructor argument olarak scanner icine file_1` yaziyoruz.

  while (scanner_1.hasNextLine) {
    val line = scanner_1.nextLine()
    //do something with line
    println(line)
  }

  //Scalanin kedni library si ile vs file read in scala
  val filePath_2 : String = "C:/Users/ted/Desktop/mes-projets/scala/labs//fichiers/res/out0.txt"
  val file_2 = new File(filePath_2)
  val scalaFileContents : Iterator[String] =  scala.io.Source.fromFile(file_2).getLines // This case getLines will be an iterator of string
  scalaFileContents.foreach(println)

  //open("path).read
  def open(path : String) = new File(path)
  implicit class RichFile(file:File) {
    def read() = Source.fromFile(file).getLines
  }

  val readLikeABoss = open(filePath_2).read()
  readLikeABoss.foreach(println)

}
