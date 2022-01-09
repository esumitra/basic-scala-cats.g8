## Basic Scala Project Template
A basic scala template for use with SBT. It provides the following features.

 - Cats library for functional programming
 - [PureConfig](https://pureconfig.github.io/) to read [typesafe configuration files](https://github.com/lightbend/config)
 - ScalaCheck test example
 - Scalatest test example
 - Cats law testing example
 - JSON encoding with circe
 - Assembly plugin to generate "fat" jars
 
The project requires Java 11, Scala 2.13 and sbt 1.5.2+ environment to run.

### Creating a new project

To create the scalatest project, run:

`sbt new esumitra/basic-scala-cats.g8 -b scalatest`

and follow the prompts.
### Getting started with SBT
cd into your project directory to run SBT commands.
 Use the following commands to get started with SBT for your project

 - Compile: `sbt compile`
 - Run tests: `sbt test`
 - Create a "fat" jar: `sbt assembly`

### License
Copyright 2022, Edward Sumitra

Licensed under the MIT license.
