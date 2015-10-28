import scala.util.Random

val N = 10

var a = new Array[Int](N)
for (i <- 0 until N) a(i) = Random.nextInt(10)

println(a.mkString("(",",",")"))
