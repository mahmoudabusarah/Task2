import types_of_Variables.str

import scala.io.StdIn.readLine
import scala.io.StdIn
object I_O_Command_Line extends App {

  // printing in new line
  println("Hello, Mahmoud T")

  // printing in same line
  print("Hello, Mahmoud T")


  // printing in error line
  System.err.println("be aware !!")


  println("Enter your first name: ")
  val firstName = readLine()

  println("Enter your last name: ")
  val lastName = readLine()

  println(s"Your name is $firstName $lastName")

  println("please enter the first number ")
  var firstnumber = readLine();

  println("Please enter the seconed number ")
  var seconednumber = readLine()

/*
  val parsedfirstnumber: Double = str.toDouble
  val parsedseconednumber: Double = str.toDouble
  i could not parsed the values
 */

  var result = firstnumber + seconednumber


  println(s"The result of $firstnumber + $seconednumber = "+result)

}
