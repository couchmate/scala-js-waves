lazy val waves = project.in(file("."))
  .enablePlugins(ScalaJSPlugin)

name := "ScalaJS Facade for waves"

normalizedName := "scala-js-waves"

version := "0.0.1"

organization := "com.couchmate"

scalaVersion := "2.11.7"

libraryDependencies +=
  "org.webjars.bower" % "waves" % "0.7.5"

jsDependencies +=
  "org.webjars.bower" % "waves" % "0.7.5" / "dist/waves.js" minified "dist/waves.min.js"
