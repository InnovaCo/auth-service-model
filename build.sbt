organization := "eu.inn"

name := "auth-service-model"

version := "0.1"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "eu.inn"  %% "binders-core"     % "0.12.85",
  "eu.inn"  %% "hyperbus-model"   % "0.1.83"
)

resolvers ++= Seq(
  "Innova libs repo" at "http://repproxy.srv.inn.ru/artifactory/libs-release-local",
  "Innova ext repo" at "http://repproxy.srv.inn.ru/artifactory/ext-release-local",
  Resolver.sonatypeRepo("public")
)

publishTo := Some("Innova libs repo" at "http://repproxy.srv.inn.ru/artifactory/libs-release-local")

credentials += Credentials(Path.userHome / ".ivy2" / ".innova_credentials")

addCompilerPlugin("org.scalamacros" % "paradise" % "2.1.0" cross CrossVersion.full)
