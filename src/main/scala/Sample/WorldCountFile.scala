package org.example
package Sample

import org.apache.spark.sql.SparkSession

object WorldCountFile {

  def main(args: Array[String]) : Unit = {
    println("***************************************************")
    println("************* WORLD COUNT SINCE A FILE ************")
    println("***************************************************")

    val spark = SparkSession.builder
      .master("local[*]")
      .appName("Spark_Word_Count")
      .getOrCreate()

    val lines = spark.sparkContext.textFile("src/data/document.txt")

    val counts = lines
      .flatMap(line => line.split("\\s+"))
      .map(word => (word, 1))
      .reduceByKey(_ + _)

    counts.foreach(println)
  }

}
