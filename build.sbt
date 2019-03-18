ThisBuild / scalaVersion := "2.11.6"
ThisBuild / organization := "com.sapienscube"

val scalaTest = "org.scalatest" %% "scalatest" % "3.0.5"

lazy val sencivil = (project in file("."))
  .aggregate(elections)
  .settings(
    name := "Sencivil",
    version:= "1.0",
    scalaVersion:= "2.11.6",
    libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.3.1",
    libraryDependencies += "org.scalactic" %% "scalactic" % "3.0.5",
    libraryDependencies += scalaTest % "test"
  )

lazy val elections = (project in file("sencivil"))
  .settings(
    name := "SenElections",
    libraryDependencies += scalaTest % "test"
  )