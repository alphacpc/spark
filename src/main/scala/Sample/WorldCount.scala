package org.example
package Sample

import org.apache.spark.sql.SparkSession

object WorldCount {

  def main(args: Array[String]): Unit ={

    val spark = SparkSession.builder
      .master("local[*]")
      .appName("Spark_Word_Count")
      .getOrCreate()

    val lines = spark.sparkContext.parallelize(
      Seq("Spark Intellij Idea Scala test one",
        "Spark Intellij Idea Scala test two",
        "Spark Intellij Idea Scala test three",
        "J'aime beaucoup le mafé !")
    )

    val counts = lines
      .flatMap(line => line.split(" "))
      .map(word => (word, 1))
      .reduceByKey(_ + _)

    counts.foreach(println)

  }

}
