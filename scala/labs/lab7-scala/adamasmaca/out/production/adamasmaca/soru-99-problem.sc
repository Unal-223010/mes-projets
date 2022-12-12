// P01 - Écrivez une fonction retournant la somme de deux nombres entiers
def somme ( x : Int , y : Int ) : Int = {
  var somme : Int = x + y
  return somme
}
somme(66,-55)
somme(0,2)

// P03.b - Écrivez une fonction retournant le plus petit de trois nombres entiers. Utilisez la fonction P3 ci-dessus

def petit( a : Int ,b : Int , c : Int) : Int = {
  if ( a > b && b > c )
    return c
  else if ( a > b && c > b  )
    return b
  else
    a
}

petit(0,1,2)
petit(1,0,2)
petit(2,0,1)
petit(2,1,0)
//pe u kullanarsak 3b

def p3b(a : Int , b : Int , c : Int) : Int = {
  var
}

p3b(4,5,7)

// P03.a - Écrivez une fonction retournant le plus petit de deux nombres entiers

def p( u : Int , z : Int ) : Int = {
  if ( u > p )
    return u
  else
    p
}





// P02 - Écrivez une fonction retournant si deux nombres entiers sont égaux
 def egaux (k : Int , l : Int ) : Boolean ={
   if (k == l) // if ( return k == l ) seklindede yazilabilir .
     return true
   else
     return false
 }

egaux(7,7)
egaux(6,7)

