object Lab2_Task4 extends App {

  val toto : Char = 'c'
  println(toto)
  println(toto.toInt) // C harfinin Unicode tablosundaki HTML kodunu outpu etti.
  val tata : Char = 90.toChar
  println(tata)
  val foo : Char = 24661.toChar // 24661 sayisinin unicode tablosundaki char ( karakter ) karsiligini output edecektir.
  println("Unicode tablosunda HTML kodu 24661 olan karakter = " + foo)
}
