class WordManager() {

  private var secretWord: String = ""
  var userWord: String = ""

  def askSecretWord(): Unit = {
    print("Rentrez le mot secret: ")
    userWord = ""
    secretWord = Input.readString().toLowerCase()
    for (i <- 0 until secretWord.length) {
      userWord += '*'
    }
  }

  def checkLetter(c: Char): Boolean = {
    var ret: Boolean = false
    var wordreplace: String = ""
    for (i <- 0 until secretWord.length) {
      if (c == secretWord.charAt(i)) {
        wordreplace += c
        ret = true
      }
      else if (userWord.charAt(i) != '*')
        wordreplace += userWord.charAt(i)
      else
        wordreplace += '*'
    }

    userWord = wordreplace
    return ret
  }


  def isWordComplete(): Boolean = {
    if (userWord == secretWord)
      return true
    else
      return false
  }
}