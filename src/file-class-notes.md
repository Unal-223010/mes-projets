# File Class Notlari

Scala.io package inin dosyalar ve dizinler uzerindeki cesitli islemler gerceklestirmek icin kullanilmaktadir.
Yani programimizda bir klasor , dizin file olusturmamiza olanak saglayan bir siniftir.Bu islemler icin `scala.io ve/veya java.io.File
class`ini import etmemiz gerekiyor.

Yani Bir File nesnesi oluşturmak için, önce java.io.File paketini içe aktarmamız gerekir.



`import java.io.File`

Sonra File class`indan file1 isimli object instancie ediyoruz.

`var File1 : File = new File("isc.txt")`

### Bazi File metotlari

``Dosya Olusturma -> createNewFile()``

``Dosya Silme -> delete()``

``Dosya Okume -> read()``

``Dosya yazma -> write()``

``Dosyanin ismini getiren metot -> getName``

Yeni bir dosya oluşturmak için createNewFile() metodunu kullanabiliriz. Eğer yeni bir dosya oluşturulursa metot true, 
dosya zaten belirtilen konumda mevcutsa false değerini döndürür.

#### Dosya Create Etme

````
import java.io
import java.io.File
import java.io.IOException

object filecreate extends App {

var file1 : File = new File("isc.txt")

try {
    if(file1.createNewFile())
        println(file1.getName + "isimli dosya olusturuldu.")
    else
        println(file1.getName + "isimli dosya zaten mevcut.")
     }

catch {
    case one : IOException =>
        println((one.getMessage))
       //getMessage isimli File Class`ina ait metod gelen hata mesagini bize dondurur.
    }

}
````
Yukaridaki kod blogu ana dizinde isc.txt isimli file olusturur ve dosya olusturuldugu icin try icinde if blogu
true deger dondurecektir.Bunu tekrar calistirirsak false dondurur . Ayrica file`in icine herhangi bir yazma islemi yapmaz.


Belirli bir path yolu vererekte istedigimiz bir yerde`de dosya create edebiliriz

````
import java.io.File

object pathfilecreate extends App {
  
  var path_file : File = new File("src/hes2.txt")
  path_file.createNewFile()
  
  }
````

#### Dosya Silme Islemi

````
Yukarida src dizini altinda create edilen hes2.txt isimli file siliniyor.

path_file.delete()
````

#### Dizin Create Etme

````
var dizin : File = new File("deneme")
dizin.mkdir()

var dizin2 : File = new File("cloud/aws")
dizin2.mkdirs()
  
````

### Dizin/Klasor Icerigini Listeleme

Bunun list metodunu kullaniriz ve metot string tipinde bir array return ettigi icin array elemanlarini goruntulemek icin mkString kullanabiliriz veya for dongusu ile
elemanlari consola outpu olarak alabiliriz.

````
var listem : Array[String] = dizin.list()
for(k<- listem.indices)
    System.out.println(listem(k))
    
File class`indan instancie ettigimiz dizin isimli object degeri attributu deneme olan (yani klasour ismim burada deneme)
klasorun altinda bulunan diger file`lari bize ekrana basar.

````

