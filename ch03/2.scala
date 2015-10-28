def swap(a:Array[Int]) {
	for (i<-0 until a.length by 2) {
		if (i!=a.length-1){
		a(i)=a(i)^a(i+1)
		a(i+1)=a(i)^a(i+1)
		a(i)=a(i)^a(i+1)
		}
	}
}

var a = Array(1,2,3,4,5)
swap(a)
println(a.mkString("(",",",")"))
