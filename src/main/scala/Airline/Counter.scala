package org.example
package Airline
import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.functions._
import org.apache.spark.sql.types.IntegerType

object Counter {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder.appName("Some Counter").master("local[1]").getOrCreate()

    var df = spark.read.format("org.elasticsearch.spark.sql")
      .option("es.nodes", "localhost")
      .option("es.port", "9200")
      .load("flights")

    // SELECT QUELQUES COLUMN ET CONVERT COLUMN TYPE
    df = df.selectExpr("DATE AS date", "AIRLINE as compagnie", "ORIGIN_AIRPORT AS origine", "DESTINATION_AIRPORT AS destination", "DISTANCE as distance")
    df = df.withColumn("distance",col("distance").cast(IntegerType))
    
    // STATISTIQUE DESCRIPTIF
    //val df_count_airline = df.groupBy("compagnie").count().sort(desc("count"))
    //val df_count_origin = df.groupBy("origine").count().sort(desc("count"))
    //val df_count_dest = df.groupBy("destination").count().sort(desc("count"))
    //val df_distance_airline = df.groupBy("compagnie").agg(sum("distance").as("total_distance")).sort(desc("total_distance"))
    //val df_airline_origine = df.groupBy("compagnie", "origine").count().sort(desc("compagnie"))
    //val df_airline_dest = df.groupBy("compagnie", "destination").count().sort(desc("compagnie"))

  }
}
