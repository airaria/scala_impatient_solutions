def positiveOrder(a:Array[Int]) = {
	var pind = for (i<-0 until a.length if a(i)>0) yield i
	var zind = for (i<-0 until a.length if a(i)==0)yield i
	var nind = for (i<-0 until a.length if a(i)<0) yield i
	var newind = pind ++ zind ++ nind
	for (i<-0 until newind.length) yield a(newind(i))
}
