package org.example
package Airline
import org.apache.spark.sql.SparkSession


object Basic {

  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder.appName("Connect Elasticsearch").master("local[1]").getOrCreate()

    var df = spark.read.format("org.elasticsearch.spark.sql")
      .option("es.port", "9200")
      .option("es.nodes", "localhost")
      .load("flights")

    // AFFICHER SCHEMA
    df.printSchema()

    // AFFICHER LES 20 PREMIERES LIGNES
    df.show()

    // SELECT SOME COLUMNS
    df = df.selectExpr("DATE AS date", "AIRLINE as compagnie", "ORIGIN_AIRPORT AS origine",
      "DESTINATION_AIRPORT AS destination", "DISTANCE as distance")

    df.show(5, false)
  }
}
