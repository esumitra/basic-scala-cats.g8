## Basic Scala Project Template
A basic scala template for use with SBT. It provides the following features.

 - Assembly plugin to generate "fat" jars
 - Typesafe configuration to use an application.conf file for running the application with different configurations
 - Cats library for functional programming
 - Specs2 test example
 - ScalaCheck test example
 - Scalatest test example
 - Cats law testing example
 
The project requires Java 8, Scala 2.12.1 and sbt 0.13.16 environment to run.

### Creating a new project
Run the command below and enter the properties for your project

`sbt new esumitra/basic-scala-cats.g8`

cd into your project directory to run SBT commands

To create the scalatest project with cats law testing example, create the project using

`sbt new esumitra/basic-scala-cats.g8 -b scalatest`
g
### Getting started
 Use the following commands to get started with your project

 - Compile: `sbt compile`
 - Create a "fat" jar: `sbt assembly`
 - Run tests: `sbt test`

### License
Copyright 2018, Edward Sumitra

Licensed under the Apache License, Version 2.0.
