//package org.example
import org.apache.spark.sql.SparkSession
import org.example.Secret.connect_PSQL

object ConnectPostgres {
  def main(args: Array[String]): Unit = {
    println("********************************************")
    println("********** CONNECT TO POSTGRESQL ***********")
    println("********************************************")

    val spark = SparkSession.builder
      .master("local[*]")
      .appName("Spark_to_postgres_connection")
      .getOrCreate()

    spark.sparkContext.setLogLevel("ERROR")

    val jdbcDF = spark.read.format("jdbc").option("url", s"""jdbc:postgresql://localhost:5432/${connect_PSQL.getOrElse("db","None")}""")
      .option("dbtable", s"""${connect_PSQL.getOrElse("table","None")}""")
      .option("user", s"""${connect_PSQL.getOrElse("user","None")}""")
      .option("password", s"""${connect_PSQL.getOrElse("password","None")}""")
      .load()

    jdbcDF.show(5)

  }
}
