name := "FizzBuzz Kata"

version := "1.0"

scalaVersion := "2.9.0"

libraryDependencies ++= Seq(
  // ScalaTest and JUnit
  "org.scalatest" %% "scalatest" % "1.6.1" % "test",
  "junit" % "junit" % "4.9" % "test",
  // Specs2
  "org.specs2" %% "specs2" % "1.5",
  "org.specs2" %% "specs2-scalaz-core" % "6.0.RC2" % "test"
)
