import java.io.{FileOutputStream, PrintWriter}
/* Code ecriture de fichier

 */
object not2  extends App {
  try {
    // The first argument is the path where the written file will be.
    // like "~/out.txt" would write the file directly in you home directory
    var i = 0
    val fs = new FileOutputStream(s"C://Users/ted/Desktop/mes-projets/scala/labs/fichiers/res//out$i.txt", true)
    //Belirtilen path`e out0 isimli file olusturdu.
    val pw = new PrintWriter(fs)
    // File icinde text yazmak icin.

    // This is the content which will be written INTO the file
    pw.println("This is the text which will be written")
    pw.println("This is the text which will be written")
    pw.println("This is the text which will be written")

    // We have to close the file when we are done working with it
    pw.close()
  } catch {
    case e: Exception =>
      println("File can't be written")
      e.printStackTrace()
  }

  println("Writing done")

}
