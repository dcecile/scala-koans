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
    def failure(testName: String, message: String): Unit = {
      failed = true
      note("*****************************************")
      note("*****************************************")
      note("")
      note("")
      note(s"$testName:")
      note("")
      note(s"  $message")
      note("")
      note("  Please meditate on this koan.")
      note("")
      note("")
      note("*****************************************")
      note("*****************************************")
      Master.studentFailed()
    }

    def apply(event: Event): Unit = {
      event match {
        case testIgnored: TestIgnored => failure(
          testIgnored.testName,
          "(ignored)")
        case testFailed: TestFailed => failure(
          testFailed.testName,
          testFailed.message)
        case testPending: TestPending => failure(
          testPending.testName,
          "__")
        case _: TestSucceeded => ()
        case _ => other(event)
      }
    }
  }

  protected override def runTest(testName: String, args: Args): Status = {
    super.runTest(testName, args.copy(reporter = new ReportToTheMaster(args.reporter), stopper = Master))
  }

}
