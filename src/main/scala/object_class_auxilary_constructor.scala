import java.util.UUID

class account(addre : String,name:String,numb:Int) {
  val _UUID= addre
  val _name=name
  val _numb= numb

def this(name: String){
  this(addre="BVRT",name,numb=1236)
}

}

object object_class_auxilary_constructor  extends App {

  val a = new account("PKL",name="shaivi",numb=1423654)
  val b = new account("RAKESh")
  val c= new account("hyderabad")
  println(a._UUID,a._name,a._numb)
  println(b._UUID,b._name,b._numb)
println(c._UUID,c._numb,c._name)

}