val input = sc.textFile("input.md") 
val count = input.flatMap(line => line.split (" ")) 
.map(word => (word,1)) 
.reduceByKey(_+_)
