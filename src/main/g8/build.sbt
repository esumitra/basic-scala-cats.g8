import Dependencies._

ThisBuild / organization := "$package$"
ThisBuild / scalaVersion := "2.13.10"
addCompilerPlugin("org.scalameta" % "semanticdb-scalac" % "4.7.8" cross CrossVersion.full)

lazy val root = (project in file(".")).
  settings(
    name := "$name$",
    scalacOptions ++= Seq(
      "-feature",
      "-deprecation",
      "-unchecked",
      "-language:postfixOps",
      "-language:higherKinds", // HKT required for Monads and other HKT types
      "-Wunused", // for scalafix
      "-Yrangepos", // required for semantic db
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
