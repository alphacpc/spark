package org.example
package Sample

import org.apache.spark.sql.SparkSession

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
