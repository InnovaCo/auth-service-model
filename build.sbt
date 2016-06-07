organization := "eu.inn"

name := "hyper-facade-model"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "eu.inn"  %% "binders-core"     % "0.12.85",
  "eu.inn"  %% "hyperbus-model"   % "0.1.76"
)

addCompilerPlugin("org.scalamacros" % "paradise" % "2.1.0" cross CrossVersion.full)
