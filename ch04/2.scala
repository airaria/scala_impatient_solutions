def word2Freq ( fn : String ) = {
	var wf =new scala.collection.mutable.HashMap[String, Int]
	val in = new java.util.Scanner(new java.io.File("myfile.txt"));
	while (in.hasNext()){
		var word = in.next()
		if (wf.contains(word)) wf(word)+=1 else wf(word)=1
	}
	wf
}

