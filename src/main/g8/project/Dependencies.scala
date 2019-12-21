import sbt._

object Dependencies {
  lazy val scalaTest = Seq(
    "org.scalatest" %% "scalatest" % "3.0.5" % Test,
    // for law testing cats based typeclasses
    "org.typelevel" %% "cats-laws" % "1.0.1" % Test,
    "org.typelevel" %% "cats-testkit" % "1.0.1"% Test,
    "com.github.alexarchambault" %% "scalacheck-shapeless_1.13" % "1.1.6" % Test
  )

  val circeVersion = "0.11.0"
  lazy val core = Seq(
    // cats FP libary
    "org.typelevel" %% "cats-core" % "1.0.1",
    "org.typelevel" %% "mouse" % "0.16",

    // support for JSON formats
    "io.circe" %% "circe-core" % circeVersion,
    "io.circe" %% "circe-generic" % circeVersion,

    // support for typesafe configuration
    "com.github.pureconfig" %% "pureconfig" % "0.10.1",

    // logging
    "com.typesafe.scala-logging" %% "scala-logging" % "3.9.2",
    "ch.qos.logback" % "logback-classic" % "1.2.3"
  )
}
