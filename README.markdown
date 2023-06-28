## Basic Scala Project Template
A basic scala template for use with SBT. It provides the following features.

 - Assembly plugin to generate "fat" jars
 - Typesafe configuration to use an application.conf file for running the application with different configurations
 - Cats library for functional programming
 - Specs2 test example
 - ScalaCheck test example
 - Scalatest test example
 - Cats law testing example
 - JSON encoding with circe

The project requires Java 11, Scala 2.13 and sbt 1.8.3+ environment to run.

### Creating a new project
Run the command below and enter the properties for your project

`sbt new esumitra/basic-scala-cats.g8`

cd into your project directory to run SBT commands

To create the scalatest project with cats law testing example, create the project using

`sbt new esumitra/basic-scala-cats.g8 -b scalatest`

### Getting started
 Use the following commands to get started with your project

 - Compile: `sbt compile`
 - Create a "fat" jar: `sbt assembly`
 - Run tests: `sbt test`
- To install in local repo: `sbt publishLocal`
 
### Static Analysis Tools

#### Scalafmt
To ensure clean code, run scalafmt periodically. The scalafmt configuration is defined at https://scalameta.org/scalafmt/docs/configuration.html

For source files,

`sbt scalafmt`

For test files.

`sbt test:scalafmt`

#### Scalafix
To ensure clean code, run scalafix periodically. The scalafix rules are listed at https://scalacenter.github.io/scalafix/docs/rules/overview.html

For source files,

`sbt "scalafix RemoveUnused"`

For test files.

`sbt "test:scalafix RemoveUnused"`

### Testing templates
Test locally using giter8

1. Install giter8 from https://www.foundweekends.org/giter8/setup.html
e.g.,
```
curl https://repo1.maven.org/maven2/org/foundweekends/giter8/giter8-bootstrap_2.12/0.16.2/giter8-bootstrap_2.12-0.16.2.sh > ~/tools/g8

chmod +x ~/tools/g8
```

2. Create project from local template
e.g., 
```
~/tools/g8 file://Users/ESumitra/workspaces/scala/basic-scala-cats.g8 --name=simpleapp --force

cd simpleapp && sbt test
```


### License
Copyright 2023, Edward Sumitra

Licensed under the Apache License, Version 2.0.
