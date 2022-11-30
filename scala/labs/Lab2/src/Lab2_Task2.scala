object Lab2_Task2 extends  App {

    val a: Float = 1f
    val b: Float = 1e+8f
    val c: Float = 1e17f
    println (((a + b) * c - b * c) / c)

  // Le résultat du calcul donne normalement d’après les règles de l’algèbre. [ (a + b ).c - b-c ] / c = a mais Le résultat est egal 0.0
  // On a une perte de précision car les float ne sont pas suffisement précision
}


