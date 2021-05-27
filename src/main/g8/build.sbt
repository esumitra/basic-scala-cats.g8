import Dependencies._

ThisBuild / organization := "$package$"
ThisBuild / scalaVersion := "2.12.12"
ThisBuild / semanticdbEnabled := true // enable SemanticDB
ThisBuild / semanticdbVersion := scalafixSemanticdb.revision // use Scalafix compatible version

lazy val root = (project in file(".")).
  settings(
    name := "$name$",
    scalacOptions ++= Seq(
      "-feature",
      "-deprecation",
      "-unchecked",
      "-language:postfixOps",
      "-Ywarn-unused-import",
      "-language:higherKinds", // HKT required for Monads and other HKT types
      "-Ypartial-unification" // PU required for better type inference
    ),
    libraryDependencies ++= Dependencies.core ++ Dependencies.scalaTest,
    assembly / mainClass := Some("$package$.MainApp"),
    assembly / assemblyJarName := "$name$.jar",
    assembly / test := {},
    assembly / assemblyMergeStrategy := {
      case PathList("META-INF", xs @ _*) => MergeStrategy.discard
      case "application.conf"            => MergeStrategy.concat
      case x =>
        val oldStrategy = (assembly / assemblyMergeStrategy).value
        oldStrategy(x)
    }
  )
