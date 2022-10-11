object Lab2_Task6 extends App {

  val word : String = TextTools.readText()
  println(s"We display th text you wrote : $word ")
  println(TextTools.capitalize(word)) // Mettre la première lettre en majuscule.

}
