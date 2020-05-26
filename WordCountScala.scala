val input = sc.textFile("input.txt") 
val count = input.flatMap(line => line.split (" ")) 
.map(word => (word,1)) 
.reduceByKey(_+_)
