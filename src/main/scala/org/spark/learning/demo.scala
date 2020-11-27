package org.spark.learning

import org.apache.spark.SparkContext
import org.apache.spark.SparkConf

object demo {
  def main(args:Array[String]){
    val conf = new SparkConf()
    conf.set("spark.master","local")
    conf.set("spark.app.name","DemoSparkApp")
    val sc = new SparkContext(conf)
    val r1 = sc.range(1,100)
    r1.collect.foreach(println)    
    sc.stop()
  }
}