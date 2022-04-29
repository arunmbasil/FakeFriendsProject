
ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.8"

lazy val root = (project in file("."))
  .settings(
    name := "FakeFriends"
  )

val sparkDependencies = Seq(
  "org.apache.spark" %% "spark-core" % "3.2.1",
  "org.apache.spark" %% "spark-sql" % "3.2.1"
)
//log4j is a transient dependencies in spark core so no need to mention it explicitly

val testDependencies = Seq (
  "org.scalatest" %% "scalatest-funsuite" % "3.2.11" %"test"
)


libraryDependencies ++= sparkDependencies ++ testDependencies