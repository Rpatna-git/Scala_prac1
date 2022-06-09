import java.time.LocalDate
import java.util.UUID

class acct(UUID:UUID, name:String,Ldate:LocalDate){
  var _UUID= UUID
  var _name=name
  var _Ldate=Ldate
}

object object_class1 extends App{

  val act_ob = new acct(UUID.randomUUID(),"Raja Sekhar",Ldate=LocalDate.now())

  println(act_ob._UUID,act_ob._name,act_ob._Ldate)

  act_ob._name ="Mounika lakshmi"
  println(act_ob._UUID,act_ob._name,act_ob._Ldate)
}
