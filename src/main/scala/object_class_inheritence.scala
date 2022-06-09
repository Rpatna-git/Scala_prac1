import java.util.UUID

class account2(id:UUID,name:String,numb:Int) {
  private val _id = id
  private var _name = name
  private val _numb = numb

  def getID:UUID = _id

  def getname:String = _name

  def getnumb:Int = _numb
  def getnameupdated(newName:String) = newName

  def this(name:String){
    this(UUID.randomUUID(),name:String,123654)
  }
}

class depoistac(name:String) extends account2(name:String) {
    private val acct_type: String = "Depoist"
    def getdepoisttype:String = acct_type
  }
class creditac(name:String) extends account2(name:String) {
    private val acct_type:String = "Credits"
    def getcredittype : String = acct_type
  }


object object_class_inheritence extends App{
  val a:depoistac = new depoistac(name= "Depoists")
  println(a.getdepoisttype,a.getID,a.getname,a.getnumb,a.getnameupdated("Raja"))
}