/**
 * Ecrivez une fonction qui renverse l'ordre des éléments d'un tableau (sans utiliser la méthode `reverse` des séquences) !
 *
 * reverse(Array(1,2,3)) -> Array(3,2,1)
 * reverse(Array(4,5,1,2)) -> Array(2,1,5,4)
 */
def reverse (in : Array[Int]) : Array[Int] ={
  var compteur: Int = (in.length - 1)
  var out: Array[Int] = new Array(in.length) // Dimitri a ajouté
  for (k <- 0 to in.length -1) {
    if ((compteur >= 0)) {
      out(k) = in(compteur) // J`ai ecrit in(k) = in(compteur) mais Dimitri a corrigé.
    }
    compteur -= 1
  }
  out
}

reverse(Array(1,2,3))
reverse(Array(4,5,1,2))

/**
 * Ecrivez une fonction qui reçoit deux tableaux unidimensionnels d'entiers de même taille en argument et qui retourne
 * un tableau dont les éléments sont la somme des éléments des deux arguments
 *
 * sum(Array(1,2,3), Array(4,5,6)) -> Array(5,7,9)
 */
def sum ( a : Array[Int], b : Array[Int]) : Array[Int] ={
  var toplam : Int = 0
  var array_new : Array[Int] = new Array[Int](3)
  var arr_ind : Int = 0
  for(i <- a.indices) {
    for(k <- b.indices) {
      toplam = a(i) + b(i)
    }
    array_new(arr_ind) = toplam
    arr_ind += 1
  }
  return array_new

}

sum(Array(1,2,3), Array(4,5,6))

/**
 * Ecrivez une fonction prenant un tableau en argument et qui retourne -1 si les éléments du tableaux sont
 * dans l'ordre croissant ou l'indice du premier élément non trié autrement.
 *
 * inOrder(Array(1.2, 2.1, 3.3, 2.5, 4.5)) --> retourne 3
 * inOrder(Array(1.2, 3.2, 4.4, 5.5)) --> retourne -1
 */
def inOrder ( in : Array[Double]) : Int = {
  var unOrderIndeks : Int = 0
  for(i<- 1 to (in.length -1))
    if ( in(i) > in(i-1) ) {
      var x : Int = -1
      unOrderIndeks = x
    }
    else {
      var y : Int = i
      unOrderIndeks = y
      return unOrderIndeks // Dimitri a ajouté
    }
  unOrderIndeks // Dimitri a ajouté

}

inOrder(Array(1.2, 3.2, 4.4, 5.5))
inOrder(Array(1.2, 2.1, 3.3, 2.5, 4.5))
inOrder(Array(1,2,5,7,6))

/*
* Ecrivez une fonction qui déplace tous les 0 d'un tableau à la fin de celui-ci.
* Vous ne devez passer qu'une fois sur les éléments et ne pouvez utiliser que les opérations de base de manipulation de tableau.
*
* move0(Array(1, 2, 0, 4, 3, 0, 5, 0)) --> Array(1, 2, 4, 3, 5, 0, 0, 0)
* move0(Array(5, 3, 2, 0, 1, 0, 0, 0, 6, 9)) --> Array(5, 3, 2, 1, 6, 9, 0, 0, 0, 0)
 */

/*
Le code ne fonctionne pas correctement,
je l'ai ajouté juste pour vous faire savoir que j'essaie de le faire.
 */

def move0(in: Array[Int]) : Array[Int] = {
  var compteur_zero : Int = 0
  var out_array : Array[Int] = new Array(in.length-1)
  for (k <- 0 to in.length-1) {
    if (in(k) == 0 ) {
      compteur_zero += 1
      out_array(out_array.length-1) = in(k)

    }
    return out_array
  }

