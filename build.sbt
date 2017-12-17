addCommandAlias("namaste", "~testOnly org.functionalkoans.forscala.Koans")

name := "Scala Koans"

version := "1.0"

scalaVersion := "2.12.4"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.0.4" % Test withSources() withJavadoc()
)

scalaSource in Test := baseDirectory.value / "koans"
javaSource in Test := baseDirectory.value / "koans"

traceLevel := -1
logLevel := Level.Info
logBuffered in Test := false

// Disable printing timing information, but still print [success]
showTiming := false

// Disable printing a message indicating the success or failure of running a task
showSuccess := false

// Show helpful compiler warnings
scalacOptions ++= Seq(
  "-deprecation",
  "-encoding", "UTF-8",
  "-feature",
  "-unchecked",
  "-Xlint",
  "-Ywarn-dead-code",
  "-Ywarn-numeric-widen",
  "-Ywarn-unused-import"
)
