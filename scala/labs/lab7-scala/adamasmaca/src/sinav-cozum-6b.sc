// Double Words soru cozumu 6b
def doubleVowels(s: String) : String= {
  var tmo : String = ""

  for(c : Char <- s){
    c match{
      case a  e i o u y => tmo = tmo + c + c // Aralar or at ve match case i duzenle
      case _ => tmo += c
    }
  }
  return tmo
}



// NoTriples 6c
def noTriples (s : String) : String = {
  var t: String = ""
  var count: Int = 0
  var last: Char = (s.charAt(0) + 1 ).toChar

  for (c <- s) {
    if (c == last) {
      count += 1
    }
    else {
      count = 0
    }
    if (count != 2) {
      t += c
      last = c
    }
  }
  return t
}


// 7. Soru

// kAGIDA NOT ALDIM ORADAN GECERSIN SAYFAYA +++















































  }
















}

