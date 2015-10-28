def swap(a:Array[Int]):Array[Int] = {
	for (i <-0 until a.length) yield {
		if (i==a.length-1)a(i)
		else if (i%2==0) a(i+1)
		else a(i-1)
	}
}

var a = Array(1,2,3,4,5)
var b = swap(a)
println(b.mkString("(",",",")"))

