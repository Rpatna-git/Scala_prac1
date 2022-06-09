object Helloworld {

  def main(args: Array[String]): Unit = {
    println("Hello World!!!")
    var res=add_age(5, 6)
    println(res)
    var res1= add_1(10,20)
    println(res1)
    var res2=add_2(10,59)
    println(res2)
  }


  def add_age(x: Int, y: Int):Int  = {
    var z =0
    z = x + y
  z
  }

  def add_1(x:Int,y:Int):Int ={
    var k=10
    k =k+12
    k
  }
  def add_2(x:Int,y:Int)= x+y


}