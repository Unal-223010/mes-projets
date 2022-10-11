object Lab2_Task1 extends App {

  //  Vous devrez ensuite afficher sur la console la plus petite des trois valeurs entrées
  println("Lutfen birinci sayiyi giriniz : ")
  val num1 : Int = Input.readInt()
  println("Lutfen birinci sayiyi giriniz : ")
  val num2 : Int = Input.readInt()
  println("Lutfen birinci sayiyi giriniz : ")
  val num3 : Int = Input.readInt()

  if (num1 > num2  &&  num2 > num3) {
    println(num3) }
  else if ( num1 > num2  && num2 < num3 ) {
    println(num2) }
  else if ( num2 > num1  && num1 > num3) {
      println(num3) }
  else if (num2 > num3  &&  num3 > num1) {
        println(num1) }
  else if (num3 > num2 && num2 > num1) {
    println(num1)}
  else
    println(num2)
}


