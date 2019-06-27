import Dependencies._
lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "$package$",
      scalaVersion := "2.12.8"
    )),
    name := "$name$",
    scalacOptions ++= Seq(
      "-feature",
      "-deprecation",
      "-unchecked",
      "-language:postfixOps",
      "-language:higherKinds", // HKT required for Monads and other HKT types
      "-Ypartial-unification" // PU required for better type inference
    ),
    libraryDependencies ++= Dependencies.core ++ Dependencies.scalaTest,
    mainClass in assembly := Some("$package$.MainApp"),
    assemblyJarName in assembly := "$name$.jar",
    test in assembly := {},
    // ignore lib refs in jars
    assemblyMergeStrategy in assembly := {
      case PathList("META-INF", xs @ _*) => MergeStrategy.discard
      case x =>
        val oldStrategy = (assemblyMergeStrategy in assembly).value
        oldStrategy(x)
    }
  )
