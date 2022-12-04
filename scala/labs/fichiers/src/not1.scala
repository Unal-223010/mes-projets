import scala.io.StdIn._

// io => input - output anlaminaa geliyor.  _ ile StdIn icindeki varolan butun ozellikleri import ediyoruz.
// Kullanicidan herhangi bir degerde Int,Double,String gibi deger alabiliyoruz bu kutuphanyi import ederek.
//Eger bunu import etmeden almak istersek asagidaki sekildede variable tanimlarken kullanabiliriz.
import scala.io.Source.{fromFile, fromURL} // Bu sekilde sadece fromFile ve fromUrl`yi import ettik yani.
import scala.Predef._

/*
{
  import scala.io.Source
  // Sadece bu blockta kullanmak icin gerekli olan kutuphaneyi import etmis olduk.Bunun disinda calismaz.
}

 */


object not1 extends App {

  val sayi_int : Int = scala.io.StdIn.readInt()
  //println(sayi_int)
  //scala.io.StdIn.readInt() ile kullancidan Int bir deger alabiliyoruz consolda.

  val sayi_Double : Double = scala.io.StdIn.readDouble()
  //println(sayi_Double)

  val st : String = scala.io.StdIn.readLine()
  //println(st)

  println(s"$st = ${sayi_Double + sayi_int}")

  val long_namearray = scala.collection.immutable.ArraySeq(false,true)
  for( i <- long_namearray.indices) {
    println(i) // 0 ve 1 olarak output edecek.Burasi indeks num. verir.
    println(long_namearray(i)) // Burasi arra elemenlari getirir.
  }

}

