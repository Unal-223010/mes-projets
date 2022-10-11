object Lab2_Task2_2 extends App {

  val a: Float = 1
  val b: Double = 1e+8
  val c: Double = 1e17
  println(((a + b) * c - b * c) / c)

  // Le résultat est egal 0.9999999843067494.
  // Alors, 1e+8f != 1e+8
  // 1e17f  = 10 uzeri 17 demek. 1e+8 = 10 uzeri8 demek.

}
