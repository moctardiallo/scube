package com.sapienscube.sencivil
    
/* SimpleApp.scala */
import org.apache.spark.sql.SparkSession

object SenCivil extends App {
    val sample7file = "/home/mctrjalloh/projects/sapienscube/data/SAMPLE-FICHIER-ELECTORAL-2017.csv" // Should be some file on your system
    val spark = SparkSession
        .builder
        .appName("Simple Application")
        .config("spark.master", "local")
        .getOrCreate()
    val sample7data = spark.read
        .format("csv")
        .option("sep", ";")
        .option("header", "true")
        .load(sample7file).cache()
    println
    println
    println
    sample7data.show
    println
    println
    println
    spark.stop()
}