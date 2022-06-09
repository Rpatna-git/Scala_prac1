

var a = Array(1,2,3,4,5,6,7,8,9)

for( i <- a){
  println(i)
}

var total=0
a.foreach(x=>total=x+1)
println(total)

///for(i<- a){
 // println(s"values inside an array is $i = " + (i+1))
//}
var newmarks = a.map(_ + 10 )
println(newmarks)

var newmarks1 = a.filter(x=>x<3)
println(newmarks1)

