object Lab2_Task3_2 extends App {
  var titi : Short = 127.toShort
  println(titi)
  titi = (titi + 1).toShort
  println(titi)
//Short 16 bitlik deger tutar . En bastaki 1 bir signe bit`idir. !!!
  println(Short.MaxValue)
  println(Short.MinValue)

  var toto : Short = (math.pow(2,15)-1).toShort //  0 111111111111111 - math.pow ussu islemleri icin kullanilir(puissance)
  println(toto)
  var tata  : Short = (math.pow(2,16)-1).toShort // 1 000000000000000
  println(tata)
  var a: Int = (math.pow(2, 16)-1).toInt
  println(a)


  var foo : Short = 0x7FFF.toShort // 7FFF hexa bicimdedir = 32767 Binary
  println("foo = " + foo)
  var faa : Short = 0xFFFF.toShort // FFFF = 65535 ama short bicimde ona gore output verecektir.
  println("faa = " + faa)
  var fii : Short = 0xF_FFFF.toShort
  println("fii = " + fii)
}

