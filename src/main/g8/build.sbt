import Dependencies._
lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "$package$",
      scalaVersion := "2.12.1"
    )),
    name := "$name$",
    scalacOptions += "-Ypartial-unification",
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
