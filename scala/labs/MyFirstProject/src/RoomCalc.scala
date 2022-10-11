object RoomCalc extends App {

  /**
   * For each dimension, display a message, gets the value from the user
   * and store the value in the corresponding variable
   */
  print("Enter width (m) : ")
  val width: Double = Input.readDouble()

  print("Enter length (m) : ")
  val length: Double = Input.readDouble()

  print("Enter height (m) : ")
  val height: Double = Input.readDouble()

  // Perform the computation
  val vol: Double = width * length * height

  // Compute the volume and displays it
  println(s"The corresponding volume is $vol m^3 big")
}