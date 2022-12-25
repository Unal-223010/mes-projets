# I / O Veri Akislari ( Data Streams )

Bu io lar ayni `collectionslar` gibi bir package yani bize bazi hazir siniflar
sunmaktadirlar.Bu class`lar sayesinde programimizda girdi(input) ve cikti(output)
islemlerini kontrolunu saglayabiliyoruz.

Veri akislarini bir yerde baska bir yere (byte dizileri halinde ) akan veriler olarak
dusunebiliriz.

Kullanicidan bir veri(input) alirken, bir dosyadan veya bir url adresinden veri okurken
buna INPUT STREAM(Veri Girdi Akisi) deniyor.

Ekrana veya herhangi bir file`a herhangi bir yere data(veri) yazmak, veri gondermek istedigimizde
buna da OUTPUT STREAMS deniyor.

````
System.out.println("Hello World") --> Output Stream gibi.
````

Scala jdk`yi kullandigi icin iki tip data streams var diyebiliriz ; Byte Streams , Character Streams.

### Byte Streams

Byte streams , tek bytlik(8 bitlik) bir datayi okumak ve yazmak icin kullanilir. Resim,grafik,ses vb. karakter tipinden
olmayan butun streams byte akimlaridir.

Tum byte streams classlari `InputStream ve OutputStream` abstract siniflarindan turetilir.Yani InputStream ve Output Stream class`larini
ogrenecegiz.Bu siniflardan uretilmis siniflari ogrenip scalada herhangi bir file i veya datayi read , write islemini gerceklestirecegiz.

### Character Stream

Tek bir data karakterini okumak ve yazmak icin kullanilir. Character streams , character tipinden datalarin input/output islemlerini
yapar.Unicode kullanildigi icin farkli ulkelerini alfabelerine uyum saglar.

Tum character data streams classlari `Reader ve Writer` abstraxt siniflarindan turetilen yapilardir.

