# Spark-Scala-Practice
Operations in Core Spark and Spark-SQL using Scala


Big Data Processing using Spark:
Why Spark in Detail -- Alternative to Spark
Core Spark, Spark-SQL, Spark Streaming, Spark ML
Big Data Analysis with Scala & Spark

Tool Setup:
	JAVA – Installing JDK -- https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html 
	SCALA – Installing Scala -- https://www.scala-lang.org/download/ 
	sbt – Installing SBT -- https://www.scala-sbt.org/release/docs/Setup.html 
	Spark – Installing spark -- https://spark.apache.org/downloads.html 
	Hadoop – On Windows -- we need winutils.exe file -- <hadoop_version>/bin
		create a folder hadoop, inside it create a folder named bin, paste the downloaded winutils.exe file
	Download IntelliJ IDEA Community Edition
		Install the Scala plugin
		Setup the JDK
		Creating a project - Click Create New Project on the Welcome Screen, then select Scala, and finally SBT Project.
		Creating a Scala worksheet & Scala Class – Execute it.
	Installing SCALA-IDE for Eclipse -- http://scala-ide.org/download/sdk.html 
		http://scala-ide.org/docs/current-user-doc/gettingstarted/index.html 

Else   https://community.cloud.databricks.com/login.html 	


Interacting with Spark: Using an IDE: IntelliJ with SBT for Scala
PyCharm For Python, or VSCode for Scala or Python Data brick Community
Edition Through Spark-Shell

Steps: Download VSCode Download Spark Install PySpark -- Pip install
pyspark Test if everything is working

    I am assuming you have Java correctly installed in your System.
    On Windows, you’ll need to install Winutils, a set of binaries needed to run Hadoop. 
    https://github.com/steveloughran/winutils

Spark Operations: Get the SparkSession =\> Code Snippet 1 Simple Select
Statement and Displaying Data =\> Code Snippet 2 ==\> Examples of
Actions we can invoke on Spark plans include: collect()— Returns our
entire Dataset count()— Returns the number of rows take(n) — Returns n
rows from the Dataset show(n, truncate=False) — Displays n rows. You can
decide to truncate the results or show the fields in all their length
Renaming and Adding Columns ==\> Code Snippet 3 ==\> Sometimes we simply
want to rename a column, or we want to add a new one with some
calculation (e.g. a CASE WHEN) Simple Aggregations ==\> Code Snippet 4
==\> Spark supports all major aggregation functions. Displaying the
Table Schema ==\> Code Snippet 5 ==\> printSchema does not trigger an
Action Explain the Execution Plan
sales\_table\_execution\_plan.printSchema() Joining in Spark ==\> Code
Snippet S3-02-Session ==\>Joins are usually the first place where we
want to look when we are having performance issues with our codeJoins
are usually the first place where we want to look when we are having
performance issues with our code Window Functions ==\> Code Snippet
S3-02-Session ==\> A window function performs a calculation on a
specific subset of rows, defined as frame or window.
https://sparkbyexamples.com/pyspark/pyspark-window-functions/

