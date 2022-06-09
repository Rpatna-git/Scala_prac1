
trait user1 {
  def getfirst:String
  def getlast:String
}

trait transaction1  {
  This:user1 =>
  def printAmountTran(amount: Int) = {
    val fullcustname = getfirst + getlast
    val tax = amount * .10
    println(s"customer ${fullcustname} needs to pay tax amount ${tax}")
  }
}

class tranRunner2(val first:String,val last:String) extends user1 with transaction1{
  override def getfirst: String = first
  override def getlast: String = last
}

object object_class_traits2 extends  App{
val a = new tranRunner2("raja","sekhar")
  a.printAmountTran(1000000)

}
