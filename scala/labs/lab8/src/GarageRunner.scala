object GarageRunner extends App {
  var car1 = new Auto("Audi TT", 135, 250)
  var car2 = new Auto("VW Golf", 100, 180)
  var car3 = new Auto("Lancia Y", 60, 150)
  var car4 = new Auto("Porsche 911", 400, 312)

  println(car1.toString)
  var my_garage = new Garage // Garage class`ini kullanrak kendimie bir garaj object`i create ettim.
  my_garage.addCar(car1)
  my_garage.addCar(car2)
  my_garage.addCar(car3)
  my_garage.addCar(car4)
  //println(my_garage.toString())

}


