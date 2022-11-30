object VolumeCalc extends App {

  // We will calculer the volume gallons type with Height × width × depth = volume formule.
  // Gallon vaut 0.00454609 m3.

  println("Volume calculator, by Unal Kulekci")

  print("Enter width (m) : ")
  val width : Double = Input.readDouble()

  print("Enter length (m) : ")
  val length : Double = Input.readDouble()

  print("Enter height (m) : ")
  val height : Double = Input.readDouble()

  // Perform the computation
  val vol : Double = width * length * height
  val gal : Double = vol * 0.00454605

  println(s"The corresponding volume is $vol m^3 and is equal to the gallon type $gal.")
  print("Goodbye and thank you.")
}
