import java.io.File

import org.apache.spark.sql.SparkSession

/**
  * User: keshav.thakur
  *
  */
object QueryEngineDriver {
  def main(args: Array[String]) {

    System.setProperty("hadoop.home.dir", "C:\\keys\\winutils\\winutils.exe");

    val S3 =  SparkSession.builder()
        .appName("Training3rd-Oct")
        .master("local[1]")
        .getOrCreate()

    val csv1 = S3.read.csv("C:\\document++\\TheGiraffeLearningClub\\SparkScala\\data\\dataManipulation.csv")
    csv1.printSchema()
    csv1.createOrReplaceTempView("S3_View")
    val queryCSV1 = S3.sql("select * from S3_View limit 5")
    queryCSV1.foreach(i => println(i))


    

    def printToFile(f: java.io.File)(op: java.io.PrintWriter => Unit) {
      val p = new java.io.PrintWriter(f);
      try {
        op(p)
      }
      finally {
        p.close()
      }
    }

   


    val outputfile = "C:\\var\\dropzone\\json\\output"
    var filename = "Query"
    var outputFileName = outputfile + "/temp_" + filename
    /*    all.coalesce(1)
          .write
          .format("com.databricks.spark.csv")
          .option("header", "false")
          .mode("overwrite")
          .save(outputFileName)*/

  }
}
