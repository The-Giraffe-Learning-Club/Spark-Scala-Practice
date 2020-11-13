import org.apache.spark.sql.{SparkSession, functions}
import org.apache.log4j.{Level, Logger}

/**
  * User: keshav.thakur
  */

object AboutJoins {

  def main(args: Array[String]) {

    Logger.getLogger("org").setLevel(Level.ERROR)

    val session = SparkSession.builder().appName("S3-02-Scala").master("local[*]").getOrCreate()

    val data1 = session.read.option("header", "true").csv("resources/mainData.csv")

    val data2 = session.read.option("header", "true").csv("resources/lookUpData.csv")
      .withColumn("PostCode", functions.concat_ws("", functions.col("PostCode"), functions.lit(" ")))

    System.out.println("=== Print 20 records of shop table ===")
    //data1.select("Name of shops", "Postcode").show()

    System.out.println("=== Print 20 records of postcode table ===")
    data2.show()

    val joined = data1.join(data2, data1.col("Postcode").startsWith(data2.col("Postcode")), "left_outer")

    System.out.println("=== Group by Region Start ===" + System.currentTimeMillis())
    joined.groupBy("Region").count().show(200)
    System.out.println("=== Group by Region End ===" + System.currentTimeMillis())


  }
}