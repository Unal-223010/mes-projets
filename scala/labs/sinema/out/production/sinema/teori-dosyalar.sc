// Les fkux d`entree sortie Java veri Akislariyla ilgili bir konu Girsis ,Cikis la alakali.
import utils.Input

var a : Int = Input.readInt()
// mesela kullanci a yi sifir secti diyelim
val b : Int = 15  / a
/*
ama bir saynin sifira bolumu tnaimsizdir.
 */

val n : Array[Int] = Array(4,3,2,1)
n(5)  = 34 // Tablomuzda 5 . indkes yok yani bu bir exceptions.Hata ciktisinda bunu goreceksin .

//mesela asagidaki hatada olulala yi cikti olarak verecek
try {
  val ng : Array[Int] = Array(4,6,3,2)
  ng(6) = 45

}
catch {
  case e : Exception => println("oulallala")
}

catch {
  case e : Exception => {
    println("oulallala")
    //e.printStackTrace()
    throw new Exception("Je ne sasis pas quio faire")
  }

}
