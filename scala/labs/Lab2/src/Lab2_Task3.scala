object Lab2_Task3 extends  App {
// Byte 8 Bitlik deger tutar. Negatif sayilarda oldugu 1 bit isaret biti olarak ayrilir.Yani ( 2 uzeri 7 -1 = 127 ) pozitif sayi( -2uzeri 7 = -128 ) negatif sayi tutar.
  var toto : Byte = 127.toByte // 01111111 Sondaki isaret bit`i. = 127
  println((toto))
  toto = (toto + 1 ).toByte // 10000000 Sondaki isaret bit`i yani negatif sayilari kast ediyor. = -128
  println(toto)
  // Byte type max degeri 127 , min degeri -128 ve en yuksekteyken 1 ekleyince en asagiya atiyor diye dusunebiliriz.
  println(Byte.MaxValue)
  println(Byte.MinValue)
}

