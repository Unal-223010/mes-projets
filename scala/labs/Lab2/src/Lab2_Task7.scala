object Lab2_Task7 extends  App {


  val text : String = TextTools.readText()
  println(s"You wrote : $text" + "  and we will make some changes. 1")

  // Mettre la chaîne mémorisée en majuscules
  println(TextTools.toUpperCase(text)) // text variable aslini degistirmez sadece bu satir yurutulurken fonksiyon variable`a etki eder.
  println(text)

  // Afficher la chaîne en inversant l’ordre de tous les caractères (sans changer la chaîne mémorisée)
  var reverse : String = TextTools.reverse(text)
  println(reverse)
  println(text)

  // Afficher "Hello World"
  println("Hello World")

  // Mettre la chaîne mémorisée en minuscules et Afficher la chaine mémorisée.
  println(TextTools.toLowerCase(text))
  var minus : String = TextTools.toLowerCase(text)
  println(minus)
  println(text)

   //Ayni src file icerisindeki baska bir scala file`daki object`yi ve object icindeki tanimli fonction cagirip kullabiliriz
  // [ OBJECTNAME ].[ FONTIONNAME] ->  TextTools.toLowerCase gibi :)

  // Enlever les consonnes de la chaîne mémorisée.
  var vowels : String = TextTools.deleteVowels(text)
  println(vowels)

  val text_2 : String = TextTools.readText()
  println(text_2)

  // Crypter la nouvelle chaîne de caractères;
  var enc : String = TextTools.encrypt(text_2) // shift cipher
  println(enc)

 //Décrypter la chaîne de caractères et l’aicher (en une seule ligne de code).
  println(TextTools.decrypt(enc))

}

























