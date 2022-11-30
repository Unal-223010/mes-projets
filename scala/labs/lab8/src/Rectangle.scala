import java.awt.Color

class Rectangle private (var width: Double ,var height: Double, var color : String ="Red" ) {
  def surface() : Double ={
    width*height
  }

  override def toString(): String = {
    s"Rectangle size is : $width X $height and color`s a $color"
  }

  def changeColor(newcolor: String): Unit = {
    color = newcolor
  }
}

object Rectangle {
  def createRectangle(width : Double, height : Double ): Rectangle = new Rectangle(width,height)
}



