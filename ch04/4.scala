def word2Freq ( fn : String ) = {
	var wf =new scala.collection.immutable.TreeMap[String, Int]
	val in = new java.util.Scanner(new java.io.File("myfile.txt"));
	while (in.hasNext()){
		var word = in.next()
		wf = wf + (word->(wf.getOrElse(word,0)+1))
	}
	wf
}

