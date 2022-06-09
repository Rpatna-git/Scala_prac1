trait Car{
  def car_breaks() = {     println(":car breaks are fine")       }
def sensors() ={println("sensors are wokring fine in car trait ")}
  def signals()
}
 trait car_automated {
   def automatic()={println("this car can go on automatic mode")}
   def sensors() ={println("sensore are wokring fine in car automated mode")}
 }
class car_parts extends Car with car_automated {

override def sensors(): Unit = super.sensors()

  def signals()={
    println("singlas are left side and right side also")
  }
}

object traits_ex1 extends  App{
  val car_ob= new car_parts()
 car_ob.signals
  car_ob.sensors
  car_ob.car_breaks
}
