import scala.util.Random

def mean(a:Array[Double]):Double = {
	a.sum / a.length
}

val N = 10
var a = new Array[Double](N)
for (i<-0 until a.length) a(i)=Random.nextDouble();
println(mean(a))
