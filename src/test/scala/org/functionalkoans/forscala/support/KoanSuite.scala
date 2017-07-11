package org.functionalkoans.forscala.support

import org.scalatest.exceptions.TestPendingException
import org.scalatest._
import org.scalatest.matchers.Matcher
import org.scalatest.events._

trait KoanSuite extends FunSuite with Matchers {

  def koan(name : String)(fun: => Unit) { test(name.stripMargin('|'))(fun) }

  def meditate() = pending

  def  __ : Matcher[Any] = {
    throw new TestPendingException
  }

  protected class ___ extends Exception {
    override def toString = "___"
  }

  private class ReportToTheMaster(other: Reporter) extends Reporter {
    var failed = false
    def failure(event: Master.HasTestNameAndSuiteName) {
      failed = true
      note("*****************************************")
      note("*****************************************")
      note("")
      note("")
      note("")
      note(Master.studentFailed(event))
      note("")
      note("")
      note("")
      note("*****************************************")
      note("*****************************************")
    }

    def apply(event: Event) {
      event match {
        case e: TestIgnored => failure(event.asInstanceOf[Master.HasTestNameAndSuiteName])
        case e: TestFailed => failure(event.asInstanceOf[Master.HasTestNameAndSuiteName])
        case e: TestPending => failure(event.asInstanceOf[Master.HasTestNameAndSuiteName])
        case _: TestSucceeded => ()
        case _ => other(event)
      }

    }
  }

  protected override def runTest(testName: String, args: Args): Status = {
    super.runTest(testName, args.copy(reporter = new ReportToTheMaster(args.reporter), stopper = Master))
  }

}
