import sbt._

object Dependencies {
  lazy val scalaSpecs = Seq(
    "org.specs2" %% "specs2-core" % "4.0.0" % "test",
    "org.specs2" %% "specs2-scalacheck" % "4.0.0" % "test"
  )

  val circeVersion = "0.11.0"
  val catsVersion = "1.5.0"
  lazy val core = Seq(
    "org.typelevel" %% "cats-core" % catsVersion,
    "org.typelevel" %% "cats-kernel" % catsVersion,
    "org.typelevel" %% "cats-macros" % catsVersion,
    "org.typelevel" %% "mouse" % "0.20",
    "io.circe" %% "circe-core" % circeVersion,
    "io.circe" %% "circe-generic" % circeVersion,
    "com.typesafe" % "config" % "1.3.1",
    "io.circe" %% "circe-config" % "0.6.1"
  )
}
