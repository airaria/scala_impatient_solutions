import scala.collection.JavaConversions.mapAsScalaMap

def word2Freq ( fn : String ) = {
	var wf: scala.collection.mutable.Map[String,Int] =new java.util.TreeMap[String, Int]
	val in = new java.util.Scanner(new java.io.File("myfile.txt"));
	while (in.hasNext()){
		var word = in.next()
		wf(word)=wf.getOrElse(word,0)+1
	}
	wf
}

