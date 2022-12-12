class Plushy(val espece : String = "", val nom : String = "", var prix : Double = 0)
{
  def getStringRepresentation(): String = {
    s"Hello, mon nom $nom et je suis un $espece. Je coute $prix francs."
  }
  def changePrix( pourcentage : Double ) : Unit = {
    prix += (prix * pourcentage)

  }

}

