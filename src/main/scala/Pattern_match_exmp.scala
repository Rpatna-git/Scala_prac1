import scala.util.matching.Regex

object Pattern_match_exmp extends App {

  def matchPattern(x:Int) =x match {
    case 1 => "Savings Account"
    case 2 => "Current Account"
    case _ => " Select either 1 or 2 from the key Board"
  }

  val pattern = new Regex("(H|h)i")
  val stringname= "i how are you i !!!!"
  val stringname1 = "Hello my age is 31 years and i borned on 1991 on April 11th "

  var result_set = pattern findFirstIn stringname
 var patter1 = new Regex("[0-9]+")
  println("option selected is "+ matchPattern(1))
  var result_Set1 = patter1 findAllIn stringname1 foreach(d=> println(d))

  println(result_set)

}


