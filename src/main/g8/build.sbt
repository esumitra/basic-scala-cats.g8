import Dependencies._
lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "$package$",
      scalaVersion := "2.12.12",
      semanticdbEnabled := true, // enable SemanticDB
      semanticdbVersion := scalafixSemanticdb.revision // use Scalafix compatible version
    )),
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
    mainClass in assembly := Some("$package$.MainApp"),
    assemblyJarName in assembly := "$name$.jar",
    test in assembly := {},
    // ignore lib refs in jars
    assemblyMergeStrategy in assembly := {
      case PathList("META-INF", xs @ _*) => MergeStrategy.discard
      case "application.conf"            => MergeStrategy.concat
      case x =>
        val oldStrategy = (assemblyMergeStrategy in assembly).value
        oldStrategy(x)
    }
  )
