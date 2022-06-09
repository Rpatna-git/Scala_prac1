object object_class_traits1 extends App {


  class customer(first:String,last:String,email:String){
    private val _first = first
    private val _last = last
    private val _email = email

    def getfirst = _first
    def getlast:String = _last
    def getemail:String=_email

  }

  trait address {
    protected var _zip:Int
    protected var _street :String
    protected var _state:String

    def getzip(zip:Int) :Unit
    def getstreet(street:String):Unit
    def getstate(state:String):Unit
    def printaddress(): Unit= println(s"${_zip},${_street},${_state}")
  }

  class cust_with_addr(first:String,last:String,email:String)
    extends customer(first:String,last:String,email:String) with address {


    override protected var _zip: Int = 0
    override protected var  _street: String = ""
    override protected var _state: String = ""

    override def getzip(zip: Int): Unit = _zip =zip
    override def getstreet(street: String): Unit = _street = street
    override def getstate(state: String): Unit = _state = state
  }

  val c1:cust_with_addr = new cust_with_addr("tony","Stark","tstark@gmail.com")
  c1.getzip(1022)
  c1.getstate("AP")
  c1.getstreet("lLR peta")
 println(c1.getlast,c1.getfirst,c1.getemail)
  c1.printaddress()
}
