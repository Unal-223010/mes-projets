class Auto (var nom : String = "",
            var power : Double ,
            var speedMAX : Double ) {
 //var nom : String = ""; var power : Double = 0.0; var speedMAX : Double = 0.0
  override def toString: String = {
    s"$nom, $power hp, $speedMAX km/h"
  }
    def isVeryFast() : Boolean = {
      if (power > 200) true else false
    }
}
/*
object GarageRunner extends App {
  val car1 : Auto = new Auto()
  car1.nom = "Audi"
  car1.power = 135
  car1.speedMAX = 250

  val car2 : Auto = new Auto()
  car2.nom ="VW Golf"
  car2.power = 100
  car2.speedMAX = 150

  val car3 : Auto = new Auto()
  car3.nom = "Porsche"
  car3.power = 400
  car3.speedMAX = 312

  val car4 : Auto = new Auto()
  car4.nom = "Lancia Y"
  car4.power = 60
  car4.speedMAX = 150

  println(car4.toString)
  println(car3.isVeryFast())
  println(car4.isVeryFast())
}
*/
