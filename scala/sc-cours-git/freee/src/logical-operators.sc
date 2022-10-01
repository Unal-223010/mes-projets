/********************************************************************
          Opératuers Logiques ( Logical Operators )
 ********************************************************************
 * *    &&       -->  et ( Conjoction ^ )
 * *    ||       -->  ou ( disjonction v )
 * *    |        -->  neégation
 ********************************************************************/

/*
1.) Opérands de type Boolean ets'évaluents à des valeurs de type Boolean
    Utilisés pour réaliser des conditions complexes
       -  a est positif et c > 5 --> (( a > 0) && (c > 5 ))
       - a n'est PAS plus petite ou égal à 5 --> !( a <= 5)

    (In English ; Logical methods, logical-and (&& and &) and logical-or (|| and |), take Boolean operands in infix
    notation and yield a Boolean result )

    The right-hand side of && and || expressions won’t be evaluated if the left-hand side determines the result.
    For example, if the left-hand side of a && expression evaluates to false, the result of the expression will definitely
    be false,so the right-hand side is not evaluated. Likewise, if the left-hand side of a || expression evaluates to true,
    the result of the expres- sion will definitely be true, so the right-hand side is not evaluated.
 */

// REMARQUE : Operators are just methods in scala.


var a = true;
var b = false;

print("a && b = " + (a&&b) )
print("a || b = " + (a||b) )
print("!(a && b) = " + !(a && b) )

// Another example
val toBE = true
val question = toBE || !true
val paradox = toBE && !toBE

