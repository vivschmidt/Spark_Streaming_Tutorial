# Spark Streaming

This Tutorial is based on https://www.dezyre.com/apache-spark-tutorial/spark-tutorial; 

1) Prerequisites
- CentOS 7 or Ubuntu
- Java Developer Kit JDK 8 
- Scala

2) Spark 
- Download Apache Spark Hadoop 2.7 (wget https://downloads.apache.org/spark/spark-2.4.5/spark-2.4.5-bin-hadoop2.7.tgz)
- Create textfile based on input.md
- Unpack Spark file with tar -xvf spark-2.1.1-bin-hadoop2.7.tgz

3) Work with Spark (Line Count)
- Start Spark-Shell in Spark directory 
$ ./bin/spark-shell

- Insert textfile into Scala
$ scala> val input = sc.textFile("input.md")

3.1) Count Lines: scala>input.count()

- Word Count (https://dzone.com/articles/wordcount-with-spark-and-scala)
4) Create a scala function based on WordCountScala.scala

- Run wordcountscala.scala in spark-shell
$ ./bin/spark-shell -i WordCountScala.scala

- Show function output)
$ scala> count.collect

3.2) Show total number of words (exclude doubles)
$ scala> count.count()

3.3) Count words in total
- Open your scala function
$ nano WordCountScala.scala

- Add the following function code
$ val words = input.flatMap(line => line.split(" ")
$ .map(word => (word))

- Re-run WordCountScala.scala in Spark-Shell

3.4) Show total no of words of a document
$ scala> words.collect

3.5) Show total no of words incl multiples
$ scala> words.count()



