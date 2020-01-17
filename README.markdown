## Basic Scala Project Template
A basic scala template for use with SBT. It provides the following features.

 - Cats library for functional programming
 - [PureConfig](https://pureconfig.github.io/) to read [typesafe configuration files](https://github.com/lightbend/config)
 - Specs2 test example
 - ScalaCheck test example
 - Scalatest test example
 - Cats law testing example
 - Assembly plugin to generate "fat" jars
 
The project requires Java 8, Scala 2.12.x and sbt 0.13.6+ environment to run.

### Creating a new project
Run the command below and enter the properties for your project

`sbt new esumitra/basic-scala-cats.g8`

cd into your project directory to run SBT commands

To create the scalatest project with cats law testing example, create the project using

`sbt new esumitra/basic-scala-cats.g8 -b scalatest`

To create a simple scalatest project for class CSCI EE-88A, create the project using

`sbt new esumitra/basic-scala-cats.g8 -b ee-88a`

### Getting started with SBT
 Use the following commands to get started with SBT for your project

 - Compile: `sbt compile`
 - Run tests: `sbt test`
 - Create a "fat" jar: `sbt assembly`

### License
Copyright 2018-2020, Edward Sumitra

Licensed under the Apache License, Version 2.0.
