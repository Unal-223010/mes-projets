class Task1Runner() {
  object Main {
    def main(args: Array[String]): Unit = {
      println("Hello world!")
    }
  }


  //var r1: Rectangle = new Rectangle(10, 5)
  //var r2: Rectangle = new Rectangle()
  //r2.width = 3
  //r2.height = 4
  //var r3: Rectangle = new Rectangle()
  //r3.width = 100
  //r2.height = 100

}

object Lab8 extends App {
  /*
  var r4 : Rectangle = new Rectangle(10,5)
  println(r4.surface())
    */
  var r5 = Rectangle.createRectangle(10,5)
  println(r5.surface())
  println(r5.toString())
  println(r5)
  println(r5.color)
  r5.changeColor("Yellow")
  println(r5.color)
}
