object Fuel extends App {
  println("Calculate fuel consumption over a certain distance")

  print("Lutfen gidilen mesafeyi giriniz (km) : ")
  var mesafe : Double = Input.readDouble()

  print("Lutfen 100 km yakilan yakit miktarini giriniz (litre): ")
  var a : Double = Input.readDouble()

  val used : Double = a / mesafe
  print(s"$used")
}
