ThisBuild / scalaVersion := "2.11.6"
ThisBuild / organization := "com.sapienscube"

lazy val sencivil = (project in file("."))
  .settings(
    name := "Sencivil",
    version:= "1.0",
    scalaVersion:= "2.11.6",
    libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.3.1",
    libraryDependencies += "org.scalactic" %% "scalactic" % "3.0.5",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % "test"
  )