object String_Concatenation extends App {

  val firstName = "Mahmoud"
  val mi = 'T'
  val lastName = "abusara"

  //First way for String Concatenation
  val name = firstName + " " + mi + " " + lastName

  //seconed way for String_Concatenation
  val name2 = s"$firstName $mi $lastName"

  println(s"Name: $firstName $mi $lastName")
  println(s"Name: $name")
  println(s"Name: $name2")


  //adding mathmatical eqaution inside println
  println(s"1+1 = ${1+1}")

 // println(s"1/0 = ${1/0}") will genrate error

  println(s"22*4 = ${22*4}")


}
