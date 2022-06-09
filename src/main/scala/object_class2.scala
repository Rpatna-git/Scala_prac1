import java.time.LocalDate
import java.util.UUID

class acct1(UUID:UUID, name:String,Ldate:LocalDate) {
  private val _UUID = UUID
  private val _name = name
  private val _Ldate = Ldate

  def getuid(): UUID = _UUID

  def getname(): String = _name

  def getdt(): LocalDate = _Ldate

  def getnewname(newname: String):String= newname

}
object object_class2  extends App{

  val act_ob = new acct1(UUID.randomUUID(),"Rajesh",Ldate=LocalDate.now())

  println(act_ob.getuid,act_ob.getname,act_ob.getdt)
  println(act_ob.getuid,act_ob.getnewname("Raja sekhar"),act_ob.getdt)
}
