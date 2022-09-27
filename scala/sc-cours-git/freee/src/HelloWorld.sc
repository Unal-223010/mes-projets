/* Scala Training - 1 */
//@format:off
/********************************************************************
 *                            [ Any ]
 ********************************************************************
 *       [ AnyVal ]             *     [ AnyRef ](java.lang.object)  *
 ********************************************************************
 * * [ Double ]                 *        [ List ]                   *
 * * [ Float  ]                 *        [ Option ]                 *
 * * [ Long   ]                 *        [ YourClass  ]             *
 * * [ Short  ]                 *                                   *
 * * [ Byte   ]                 *                                   *
 * * [ Unit   ]                 *                                   *
 * * [ Boolean]                 *                                   *
 * * [ Char   ]                 *                                   *
 ********************************************************************
 *                                        [ Null ]                  *
 ********************************************************************
 *                         [ Nothing ]                              *
 ********************************************************************/
//@format:on



// Bir tane workshet create ettik.Bos bir scala dosyasi aslinda. ?
print("Hello World")

14 + 42

"""res1""" // String olarak yazdim.Bunu otomatik olarak bir variable' assing etti.
// Yani res2 = res1 oldu ve bunu val ile yaptigi icin immutable , yani sonradan degistirilemez.

res2.charAt(2) // res1'in 2. karakterini getirdi. For using index

// res2 = """ali"""  reassignment to val hatasi doner compile asamasinda.

val unal = "swimm"

print(s"$unal")
// Bu iki satir ayni outputu veriyor.
print(unal)

print("unal")

// Scala butun data type'lar bir object'dir ve ayni zamanda Any type'nde bir variable'dir.

val sayi1 : Int = 1 // sayi1 degiskeni immutable bir object oldu artik.
// Int type'inda sayi1 ve sayi2 variable'larina value assing ettik.
var sayi2 : Int = 2
// sayi2 isimli variable var ile create edildigi yeniden value assign edebiliriz.
var sayi2 : Int = sayi1 + 5

sayi2 // sayi2 variable'nin degerini val ile res7 variable'ina atadi otomatik olarak.
print(res7)

val a : Int = 23
var b : Int = 28
b += 1 // Tekar maksatli b variable'in yeni degeri 29.
print(b)

// val ile listem isimli Any type'inda bir liste create ediyoruz.Any type'inda yaptigimiz icine farkli data type'larini yazabiliyoruz.
val listem : List[Any] = List(1, "String" , false , 2.22)
listem // Bu sekilde yazinda listem isimli listeyi yeni bir variable'a assign etti . res11 isimli variable degeri .
print(res11)
print(listem)







