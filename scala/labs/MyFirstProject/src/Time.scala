object Time extends App {

  print("Enter hours : ")
  val hours = Input.readInt()

  print("Enter minutes : ")
  val minutes = Input.readInt()
  val seconds = hours * 3600 + minutes * 60

  println(s"The time is the same as $seconds seconds")

}
