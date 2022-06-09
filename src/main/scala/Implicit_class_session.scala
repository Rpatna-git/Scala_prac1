

object Implicit_class_session extends App{

  implicit class Stringcharclass(x: String){
    def stringFirstChar():String  = x.substring(0,1)
  }

  val string_patern:String = " Gello How are you"
  var result_Set=string_patern.stringFirstChar
  println("print the firt char as ",string_patern.toUpperCase)
  println("print the firt char as ",result_Set)


}
