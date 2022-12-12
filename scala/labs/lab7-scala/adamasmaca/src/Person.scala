class Person(var nom: String = "", var prenom: String = "", var age: Int = 0, var taille: Int = 0)
{
  def birthday() : Unit = {
    age += 3
  }
  def display() : Unit = {
    println(s"$prenom $nom a $age ans et sa taille est $taille cm.")
  }

}

object p1 extends App {
  var person1 : Person = new Person("unal","kulekci",28,180)
  person1.display()
  person1.birthday()
  person1.display()
}