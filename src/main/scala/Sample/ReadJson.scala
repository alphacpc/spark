package org.example
package Sample

import org.apache.spark.sql.SparkSession

object ReadJson {
  def main(args : Array[String]):Unit = {


    println("*****************************************************")
    println("****************** LOAD JSON FILE *******************")
    println("*****************************************************")

    val spark = SparkSession.builder().appName("load_csv_file").master("local[*]").getOrCreate()

    val df = spark.read.option("multiline","true")
      .json("src/data/users.json")

    df.show()

  }
}
