package org.functionalkoans.forscala.support
import org.scalatest.Reporter
import org.scalatest.Stopper
import org.scalatest.Distributor
import org.scalatest.Filter
import org.scalatest.Tracker
import org.scalatest.FunSuite
import org.scalatest.SeveredStackTraces
import org.scalatest.events.Event
import org.scalatest.events.{TestSucceeded, TestFailed}

trait KoanSuite extends FunSuite with SeveredStackTraces {
    override def runTests(testName : Option[String], reporter : Reporter, stopper : Stopper, filter : Filter,
                         configMap : Map[String, Any], distributor : Option[Distributor], tracker : Tracker) {       

       if (testName == null)
          throw new NullPointerException("testName was null")
        if (reporter == null)
          throw new NullPointerException("reporter was null")
        if (stopper == null)
          throw new NullPointerException("stopper was null")
        if (filter == null)
          throw new NullPointerException("filter was null")
        if (configMap == null)
          throw new NullPointerException("configMap was null")
        if (distributor == null)
          throw new NullPointerException("distributor was null")
        if (tracker == null)
          throw new NullPointerException("tracker was null")

        class KoanReporter(wrappedReporter : Reporter) extends Reporter {
            var succeeded = false

            override def apply(event : Event) = {
                event match {
                    case e : TestSucceeded => succeeded = true
                    case _ =>
                }
                wrappedReporter(event)
            }
        }

        val stopRequested = stopper

        // If a testName is passed to run, just run that, else run the tests returned
        // by testNames.
        testName match {
          case Some(tn) => runTest(tn, reporter, stopRequested, configMap, tracker)
          case None =>
            var failed = false
            for (test <- testNames.iterator) {
              if (failed == false) {
                  val koanReporter = new KoanReporter(reporter)
                  runTest(test, koanReporter, stopper, configMap, tracker)
                  failed = !koanReporter.succeeded
              }
            }
        }
    }

    def koan(name : String)(fun: => Unit) = test(name)(fun)
}
