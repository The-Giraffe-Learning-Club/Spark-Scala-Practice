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


    /*val transformation = spark.read.json("src/main/resources/data/QueryFormat.json")
    transformation.printSchema()
    transformation.createOrReplaceTempView("cste_query_tmp")

    val all = spark.sql("SELECT StepQuery FROM cste_query_tmp")
    //all.foreach(r => println(r))


    val transform = spark.read.json("src/main/resources/data/framedefinition.json")
    transform.printSchema()
    transform.createOrReplaceTempView("query_json_tmp_1")

    val selected_1 = spark.sql("SELECT frameDefinition.logical.dimensions.tranformationType.query.steps FROM query_json_tmp_1")
    selected_1.foreach(r => println(r))
    selected_1.createGlobalTempView("query_json_tmp_2")*/

    //selected_1.map()


    /*val selected_2 = spark.sql("SELECT * FROM query_json_tmp_2")
    selected_2.foreach(z => println(z))*/

    def printToFile(f: java.io.File)(op: java.io.PrintWriter => Unit) {
      val p = new java.io.PrintWriter(f);
      try {
        op(p)
      }
      finally {
        p.close()
      }
    }

    //printToFile(new File("C:\\dev\\nielsen\\platform\\query\\CSTEQuery1.sql")) { p => all.collect().foreach(p.println) }

    //printToFile(new File("C:\\dev\\nielsen\\platform\\query\\CSTEQuery5.sql")) { p => selected_1.collect().foreach(p.println) }


    val outputfile = "C:\\var\\dropzone\\json\\output"
    var filename = "CSTEQuery"
    var outputFileName = outputfile + "/temp_" + filename
    /*    all.coalesce(1)
          .write
          .format("com.databricks.spark.csv")
          .option("header", "false")
          .mode("overwrite")
          .save(outputFileName)*/

  }
}
