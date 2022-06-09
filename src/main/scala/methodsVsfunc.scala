object methodsVsfunc extends App {



    var ar1:Array[String]=Array("tes","goog","camp","kuku")

    def getmethod():Int = ar1.length
    val getfucntion=() => ar1.length

    println("calling method",getmethod)
    println("calling function",getfucntion.apply())

  def getmetnhod1(x:String):Boolean= ar1.contains(x)
  val getfunction1 = (x:String)=> ar1.contains(x)

  println("calling method with arg",getmetnhod1("goog"))
  println("calling function with arg",getfunction1("good"))

}
