name := "Training3rdOct"

version := "0.1"

scalaVersion := "2.11.12"

scalacOptions ++= Seq("-unchecked", "-deprecation")

libraryDependencies += "org.apache.spark" %% "spark-core" % "2.3.0"

libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.3.0"

libraryDependencies += "io.spray" %%  "spray-json" % "1.3.5"

libraryDependencies += "org.typelevel" %% "cats-core" % "2.0.0-RC1"
libraryDependencies += "net.snowflake" %% "spark-snowflake" % "2.5.1-spark_2.4"
libraryDependencies += "com.databricks" %% "dbutils-api" % "0.0.1"
libraryDependencies += "net.snowflake" % "snowflake-ingest-sdk" % "0.9.6"
libraryDependencies += "net.snowflake" % "snowflake-jdbc" % "3.8.5"


//For JAVA Based Query Engine
libraryDependencies += "com.jayway.jsonpath" % "json-path" % "2.4.0"
libraryDependencies += "net.minidev" % "json-smart" % "2.1.0"
libraryDependencies += "org.ow2.asm" % "asm" % "7.1"
libraryDependencies += "org.slf4j" % "slf4j-api" % "2.0.0-alpha0"
libraryDependencies += "ch.ethz.ganymed" % "ganymed-ssh2" % "build210"
libraryDependencies += "com.github.gphat" %% "wabisabi" % "2.2.0"




libraryDependencies ++= {
  Seq(
    "org.json4s" %% "json4s-ext" % "3.5.0",
    "org.json4s" %% "json4s-native" % "3.5.0",
    "org.scalatest" %% "scalatest" % "2.2.6" % Test
  )
}


/*val jacksonVersion = "2.10.0.pr1"

libraryDependencies ++= Seq(
  "com.fasterxml.jackson.core" % "jackson-core" % jacksonVersion,
  "com.fasterxml.jackson.core" % "jackson-annotations" % jacksonVersion,
  "com.fasterxml.jackson.core" % "jackson-databind" % jacksonVersion,
  "com.fasterxml.jackson.module" % "jackson-module-paranamer" % jacksonVersion,
  // test dependencies
  "com.fasterxml.jackson.datatype" % "jackson-datatype-joda" % jacksonVersion % "test",
  "com.fasterxml.jackson.datatype" % "jackson-datatype-guava" % jacksonVersion % "test",
  "com.fasterxml.jackson.module" % "jackson-module-jsonSchema" % jacksonVersion % "test",
  "org.scalatest" %% "scalatest" % "3.0.8" % "test",
  "junit" % "junit" % "4.12" % "test"
)*/


javaOptions in run += "-XX:MaxPermSize=128M"

scalacOptions += "-target:jvm-1.8"

