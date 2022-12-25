import scala.io._
import java.io
import java.io.File
import java.io.IOException

object filecreate extends App {
  //Creating File
  var path_file: File = new File("src/hes2.txt")
  path_file.createNewFile() // Belirtile path yolunda hes2.txt isimli file olusturulur.

  var file1 : File = new File("isc.txt") // Ana dizinde isc.txt isimli file olusturulur,alttaki try-catch bloklariyla
  try {
    if(file1.createNewFile())
      println(file1.getName + "isimli dosya olusturuldu.")
    else
      println(file1.getName + "isimli dosya zaten mevcut.")
  }
  catch {
    case one : IOException =>
      println((one.getMessage))
      //getMessage isimli File Class`ina ait metod gelen hata mesagini bize dondurur.
  }

  var path2: File = new File("src/hes-so.txt")
  //var path : File =  new File("c/Users/ted/Desktop/hes-so.txt") bu blokta The system cannot find specified path mesaji dondu. ??


  try {
    if (path2.createNewFile())
      println(path2.getName + " isimli file " + path2.getPath + " de olusturuldu")
    else
      println(path2.getPath + " path yolunda " + path2.getName + " isimli file zaten mevcut")
  }
  catch {
    case first: IOException =>
      println(first.getMessage)
  }

  //Delete File
  if(file1.delete())
    println(s"file1 object i olusturulan isc.txt isimli file silindi, ve blok calisti cunku file.delete() metodu ${file1.delete()} gibi bir Boolean deger dondurur.")


  // Dizin create etme
  var dizin : File = new File("deneme")
  dizin.mkdir()

  var dizin2 : File = new File("deneme2")

  try {
    if (dizin2.mkdir())
      println("deneme2 isimli dizin olusturuldu")
    else
      println("deneme2 isimli dizin zaten mevcut")
  }
  catch {
    case two: IOException =>
      println(two.getMessage)
  }

  // Alt alta dizin(klasor) olusturma
  var nested_dizin : File = new File("deneme/dev1")
  nested_dizin.mkdirs()

  // Klasordeki file`lari listeleme
  var a : Array[String] = dizin.list()
  for(i<-a.indices)
    println(a(i))



}

