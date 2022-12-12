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


def play(): Boolean = {
  word.askSecretWord()
  Show()
  while (!word.isWordComplete() && current_step != MAX_STEPS) {
    println("Current step is " + current_step)
    var askLetter = Input.readChar()

    word.checkLetter(askLetter)
    if (!word.checkLetter(askLetter))
      current_step += 1
    Show()
    println(word.userWord)
  }
  if (word.isWordComplete())
    println("Bravo vous avez trouvé le mot secret")
  else
    println("Keep trying")

  playAgain()
  return true
}
}