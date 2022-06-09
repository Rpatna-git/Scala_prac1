object valvarlazydef_demo extends App {

  var data = { println("Array is initializing");Array("GOOG","TES","MOM")
  }
  println("Before accessing data")
    data.foreach(println)
    println("--------------------")
   data = { println("Array is initializing again");Array("GOOG","TES","MOM")}
    data.foreach(println)

  val data1 = { println("Array is initializing");Array("GOOG","TES","MOM")
  }
  println("Before accessing data")
  data1.foreach(println)
  println("--------------------")
  data1.foreach(println)
  println("done val case")

 lazy val data2 = { println("Array is initializing for lazy val");Array("GOOG1","TES","MOM")
  }
  println("Before accessing data")
  data2.foreach(println)
  println("--------------------")
  data2.foreach(println)
  println("done")

  def stok:Int ={
    println("returning the stock price")
    14
  }
  def vol:Int = {
    println("returning the volume of stock")
    10
  }
  def finalvalue :Int = stok * vol
  println(s"returning the final value $finalvalue")

  println("-----------------------------")
  def finalvalue1 : Int = stok * vol
  println(s"returning the final value $finalvalue1")
  println("completed def for stock")

  def data3:Array[String] =  {
    println("After accessing the data");
    Array("goog","tes","camp")
  }
println("Before accessing the data")
  data3.foreach(println)
  println("--------------------")

  data3.foreach(println)
}
