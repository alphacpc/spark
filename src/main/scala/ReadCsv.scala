package org.example
import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.functions._

object ReadCsv {

  def main(args: Array[String]): Unit = {

    println("*****************************************************")
    println("****************** LOAD CSV FILE ********************")
    println("*****************************************************")

    val spark = SparkSession.builder().appName("load_csv_file").master("local[*]").getOrCreate()

    val df = spark.read.format("csv")
      .option("inferSchema", "true")
      .option("header", "true")
      .option("sep", ",")
      .load("src/data/expresso.csv")

    df.show()

    df.printSchema()

    df.select("user_id").show()

    df.summary().show()
  }

}
