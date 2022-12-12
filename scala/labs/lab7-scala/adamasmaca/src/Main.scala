object Main extends App {

  // Person Class file`ndan geliyor bilgiler vs
  var p1: Person = new Person("kulekci", "unal", 28, 180)
  p1.display()
  p1.birthday()

  // Plushy Class file`ndan geliyor bilgiler vs.
  var a1 : Plushy = new Plushy("ours", "Bobo", prix = 12.0)
  a1.changePrix(0.2)
  println(a1.getStringRepresentation())

  // Pour teste method askSecretWord dans la class wordManager
  var c : WordManager = new WordManager()
  c.userWord
  c.askSecretWord()
  println(c.userWord)

}