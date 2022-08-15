package org.example
import org.apache.spark.sql.SparkSession

object ConnectElasticsearch {

  def main(args : Array[String]) : Unit = {

    val spark = SparkSession.builder.appName("Elasticsearch").master("local[*]").getOrCreate()

    val reader = spark.read.format("org.elasticsearch.spark.sql")
      .option("es.port", "9200")
      .option("es.nodes", "localhost")

    val df = reader.load("flights")

    println(f"Df length => ${df.count()}")

    df.show()

  }

}
