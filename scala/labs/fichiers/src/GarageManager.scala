import scala.collection.immutable.HashMap

/**
 * A sample garage application for demonstrating text file output
 */
object GarageManager {
  def main(args: Array[String]): Unit = {
    val gm = new GarageManager()

    // Prestation 0 is "Tire replacement "
    // Prestation 1 is "Battery replacement"
    // Prestation 2 is "Windshield exchange"
    // Prestation 3 is "Oil filter change"
    // Prestation 4 is "Pollution control"
    // Prestation 5 is "Oil level control"
    // Prestation 6 is "Brake revision"
    val client1 = Array(1, 2, 3)
    val bill1 = gm.generateBill(client1)
    println(bill1)

    val client2 = Array(4, 4, 4, 4, 4, 5)
    val bill2 = gm.generateBill(client2)
    println(bill2)
    
    // TODO: Complete with your code here to write the bill in a file
  }
}

class GarageManager() { // The various services provided in this garage
  val services = HashMap(
    "Windshield exchange" -> 60,
    "Oil level control" -> 20,
    "Tire replacement " -> 50,
    "Oil filter change" -> 210,
    "Battery replacement" -> 320,
    "Pollution control" -> 200,
    "Brake revision" -> 400,
  )

  def generateBill(operationsPerformed: Array[Int]): String = {
    var total_sum = 0
    val keys = services.keySet.toArray
    var result = ""
    result += "*************************\n"
    result += "* Super Auto 20000 invoice ****\n"
    result += "*******************************\n\n"

    // Generate the text corresponding to the operations done in the garage
    for (i <- operationsPerformed.indices) {

      if (operationsPerformed(i) > services.size) {
        System.err.println("Error, non existing prestation !")
        System.exit(-1)
      }

      val k = keys(operationsPerformed(i))
      result += s"- $k \t${services.getOrElse(k,0)}\n"
      total_sum += services.getOrElse(k, 0)
    }

    result += "\n----------------------------------\n"
    result += " Invoice total \t\t\t" + total_sum + "\n"
    result += "----------------------------------\n"
    result += "\nPayment due in 30 days. Thank you !"
    result
  }
}
