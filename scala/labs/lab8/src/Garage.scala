class Garage () {
  private var stock : Array[Auto] = new Array[Auto](100)
  private var stock_size: Int = 0

/*
  def displayFastCars() : String = {
    toString()
  }
*/

  def addCar(a : Auto) : Unit = {
    var numberOfAuto : Int = 0
    if (numberOfAuto < 100)
      stock(numberOfAuto) = a

    numberOfAuto += 1
}

def getNumberOfCars() : Int = {
  return stock.length
}


  override def toString : String = {
    var text : String = "Garage content : \n"
    println("Garage content :")
    for(cars <-stock.indices) {
      var add : String = s"""Car$cars : ${stock(cars).nom}, ${stock(cars).power} , ${stock(cars).speedMAX} """
      text + add
    }
  return text
  }

}

