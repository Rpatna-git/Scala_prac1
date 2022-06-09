case class object_class_caseclass(name:String,amount:Double,kind:String)

object tranrunner extends App {
  val a= object_class_caseclass("Raja",1000.23,"Depoist")
  println (a.toString)
  val b= object_class_caseclass("Raja",50,"Wihtdraw")
  println(b.toString)

  println(a==b)
  val c= a.copy(amount=2564)
  println(c)
  val amount = b match {
    case object_class_caseclass(_, amount, _) if amount > 10 => amount + 100
  }
  println(amount)

}
