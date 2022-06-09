trait user {
  def getfirst:String
  def getlast:String
}

trait transaction extends user {
  def printAmountTran(amount: Int) = {
    val fullcustname = getfirst + getlast
    val tax = amount * .10
    println(s"customer ${fullcustname} needs to pay tax amount ${tax}")
  }
}

class tranRunner1(val first:String,val last:String) extends transaction {
  override def getfirst: String = first
  override def getlast: String = last
}

object object_class_trait_selfype extends App{

  val a = new tranRunner2("raja","sekhar")
  a.printAmountTran(1000000)

}

