def ltegt(values: Array[Int],v:Int) = {
	(values.count(_ < v),values.count(_==v),values.count(_>v))
}
