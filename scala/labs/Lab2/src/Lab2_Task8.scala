object Lab2_Task8 extends App {

print("Please enter the number of seconds : ")

val seconds : Int = Input.readInt()

val hour : Int = seconds / 3600
val min  : Int = (seconds % 3600) / 60
val sec  : Int = (seconds % 3600) % 60

println(s"$hour : $min : $sec")
}


/*

  Write a program to convert a number of seconds into hours, minutes and seconds.
  euse the Input.readInt() methods from the lab's Input.scala

 */
