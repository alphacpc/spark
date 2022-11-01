package org.example
package Sample

import Secret.connect_MYSQL

import org.apache.spark.sql.SparkSession

object ConnectMysql {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder
      .master("local[*]")
      .appName("Spark_to_mysql_connection")
      .getOrCreate()

    spark.sparkContext.setLogLevel("ERROR")

    val jdbcDF = spark.read.format("jdbc").option("url", s"""jdbc:mysql://localhost:3306/${connect_MYSQL.getOrElse("db","None")}""")
      .option("dbtable", s"""${connect_MYSQL.getOrElse("table","None")}""")
      .option("user", s"""${connect_MYSQL.getOrElse("user","None")}""")
      .option("password", s"""${connect_MYSQL.getOrElse("password","None")}""")
      .load()

    jdbcDF.show()
  }
}
