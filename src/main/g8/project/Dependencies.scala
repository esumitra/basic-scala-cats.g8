import sbt._

object Dependencies {
  lazy val scalaSpecs = Seq(
    "org.specs2" %% "specs2-core" % "4.0.0" % "test",
    "org.specs2" %% "specs2-scalacheck" % "4.0.0" % "test"
  )

  val circeVersion = "0.9.1"
  lazy val core = Seq(
    "org.typelevel" %% "cats-core" % "1.0.1",
    "org.typelevel" %% "mouse" % "0.16",
    "com.typesafe" % "config" % "1.3.1",
    "io.circe" %% "circe-core" % circeVersion,
    "io.circe" %% "circe-generic" % circeVersion,
    "io.circe" %% "circe-parser" % circeVersion,
    "io.circe" %% "circe-config" % "0.4.1"
  )
}
