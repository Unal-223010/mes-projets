// class WordManager( var userWord : String )
class WordManager() {
  //private var secretWord: String = Input.readString().toLowerCase()

  private var secretWord : String = ""
  var userWord : String = ""

  def askSecretWord(): Unit = {
    println("What is the your secret word ? Please enter your secret word :  ")
    userWord = ""
    secretWord = Input.readString().toLowerCase()
    for ( i <- 0 until secretWord.length){
      userWord += '*'
    }
  }

  // String replace tache-3 2
  def checkletter( c: Char ) : Boolean = {
    var r : Boolean = false
    var wordR : String = ""

    for(k <- 0 until  secretWord.length)
      if( c == secretWord.charAt(k)) {
        wordR += c
        r = true
      }
      else if (userWord.charAt(i) != '*')
        wordR += userWord.charAt(i)
      else
        wordR += '*'

  }

  // Tache 3-4
  def isWordComplete() : Boolean = {
    var check : Boolean = false

    for(j <- 0 until userWord.length)
      if( userWord.charAt(j) != "*")
        check = true
      else
        check = false

    return check
  }
}





