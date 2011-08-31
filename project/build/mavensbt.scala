import sbt._

class FunctionalKoans(info: ProjectInfo) extends DefaultProject(info) {
  val mavenLocal = "Local Maven Repository" at "file://" + Path.userHome + "/.m2/repository"
  val scalatest = "org.scalatest" % "scalatest" % "1.2"

  log.setTrace(-1)

  lazy val koans = testOnlyAction(Array("org.functionalkoans.forscala.Koans")) describedAs "Run through the Scala Koans"

}
