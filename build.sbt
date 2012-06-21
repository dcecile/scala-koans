name := "Scala Koans" 

version := "1.0"

scalaVersion := "2.9.2"

traceLevel := -1

logLevel := Level.Info

retrieveManaged := true

// disable printing timing information, but still print [success]
showTiming := false

// disable printing a message indicating the success or failure of running a task
showSuccess := false

// append -deprecation to the options passed to the Scala compiler
scalacOptions += "-deprecation"
