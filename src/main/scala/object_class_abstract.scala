import java.util.UUID

abstract class account3(id:UUID,name:String,numb:Int) {
  private val _id = id
  private var _name = name
  private val _numb = numb
  val acct_type:String
  def getID:UUID = _id

  def getname:String = _name

  def getnumb:Int = _numb
  def getnameupdated(newName:String) = newName

  def this(name:String){
    this(UUID.randomUUID(),name:String,123654)
  }
  def getaccttype:String =acct_type
}

class depoistac1(name:String) extends account3(name:String) {
  override val acct_type: String = "Depoist"

  override def getaccttype: String = acct_type
}
class creditac1(name:String) extends account3(name:String) {
  override val acct_type: String = "Credits"

  override def getaccttype: String = acct_type
}
object object_class_abstract extends App{
  val k:account3 = new depoistac1("Fixed depoist")
  val l:account3 = new creditac1("Credits")

  println(k.getnumb,k.getname,k.getID,k.getnameupdated("rajasekhar1"),k.getaccttype)
  println(l.getnumb,l.getname,l.getID,l.getnameupdated("raja sekhar2"),l.getaccttype)


}
