package org.example
package Airline

import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.functions._

object airpline {

  def main(args: Array[String]): Unit = {

    val spark = SparkSession.builder.appName("Elasticsearch").master("local[1]").getOrCreate()

    val reader = spark.read.format("org.elasticsearch.spark.sql")
      .option("es.port", "9200")
      .option("es.nodes", "localhost")

    var df = reader.load("flights")

    df = df.select("NUM_FLIGHT", "ORIGIN_AIRPORT", "DESTINATION_AIRPORT", "AIRLINE", "DATE", "DISTANCE")

    df.show()

    val df_airline = df.select("AIRLINE")
    val df_airport_origin = df.select("ORIGIN_AIRPORT")
    val df_airport_dest = df.select("DESTINATION_AIRPORT")

    df.select(col("AIRLINE")).distinct().show(1000, false)

    df_airport_origin.distinct().show(1000, false)

    df_airport_dest.distinct().show(1000, false)

  }

}
