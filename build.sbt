addCommandAlias("namaste", "~test-only org.functionalkoans.forscala.Koans")

name := "Scala Koans"

version := "1.0"

scalaVersion := "2.12.1"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.0.3" % Test withSources() withJavadoc())

scalaSource in Test := baseDirectory.value / "koans"
javaSource in Test := baseDirectory.value / "koans"

traceLevel := -1
logLevel := Level.Info
logBuffered in Test := false

// Disable printing timing information, but still print [success]
showTiming := false

// Disable printing a message indicating the success or failure of running a task
showSuccess := false

// Append -deprecation to the options passed to the Scala compiler
scalacOptions ++= Seq("-deprecation", "-unchecked", "-feature")

// Disable updating dynamic revisions (including -SNAPSHOT versions)
offline := true
