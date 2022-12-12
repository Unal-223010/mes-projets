// 3 bolum tache 5 icin FunGraphics dosyasini add  Libraray yaptim ve sonrasinda import ettim FunGraphics kutuphanesini
import hevs.graphics.FunGraphics

class HangMan () {
  var word: WordManager = new WordManager()
  val maxSteps : Int = 8
  var currentSteps : Int = 0
  // Parti 3 tache 5 icin 300,300 pixsellik bir tane pencere variable create ediyorum
  // Créez une instance de FunGraphics pour faire apparaître une fenêtre vide de 300 x 300 pixels
  var display : FunGraphics = new FunGraphics(300,300)

  //Créez la méthode updateGraphicsView() sans paramètre et sans retour



  def play() : Boolean = {
    println("Bir harf giriniz : ")
    var letter : Char = Input.readChar()
    word.askSecretWord()

    while(word.isWordComplete() && currentSteps !=maxSteps)
      println("Current step is " + currentSteps)
      var askLetter = Input.readChar()
      currentSteps += 1

      word.checkletter(askLetter)
      if (!word.checkletter(askLetter)){
        currentSteps += 1
        println(word.userWord)
      }

    // ADAMASMACA sinifindaki isWordComplete metodunu cagiriyorum.
    if (word.isWordComplete())
      println("Kelimeyi Buldunuz :) ")
    else
      println("Yeniden Deneyiniz .. ")



  }

}




