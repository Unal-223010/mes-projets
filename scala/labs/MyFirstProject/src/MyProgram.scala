object MyProgram extends  App {
  // Declares two values
  val toto : Int = 6
  val titi : Int = 778

  // Computes the sum of two values
  val theSum : Int = toto + titi

  // Display the result
  print("The sum goal is equal to : ")
  println(theSum)
  /* Bu iki print blogunun ciktisi The sum goal is equal to : 7 seklinde olacaktir . 7 println`^den geliyor. */


  // Experiment by changing the program to have a multiplication rather than a sum.
  val theMult : Int = toto * titi
  print("The multiplication is equal : ")
  println(theMult)
}
