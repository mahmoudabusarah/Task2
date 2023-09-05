object types_of_Variables extends App{


  /* this class show the types of variables such as

  1) integer
  2) string
  3) double
  4) chareter

   eg.

   */
  val str = "hello";
  val int = 20;
  val double = 20.0;
  val char= 's';

  println("printing String: "+str)
  println("printing intger: "+int)
  println("printing Double: " + double)
  println("Printing charecter: "+char)

  // Using val (immutable variable)
  val age = 30
  println(s"Age (val): $age")

  // This line would result in a compilation error because you cannot reassign a val.
  // age = 31

  // Using var (mutable variable)
  var count = 5
  println(s"Count (var): $count")

  // You can reassign a var without any issues.
  count = 10
  println(s"Updated Count (var): $count")


}
