package org.functionalkoans.forscala.support

import org.scalatest.events.Event
import org.scalatest.Stopper
import language.reflectiveCalls

object Master extends Stopper {
  var studentNeedsToMeditate = false

  type Event = {
    val testName: String
    val message: String
  }

  def studentFailed (event: Event): String = {
    studentNeedsToMeditate = true
    meditationMessage(event)
  }

  private def meditationMessage(event: Event) = {
    s"Please meditate on koan '${event.testName}': ${event.message}"
  }

  override def stopRequested: Boolean = studentNeedsToMeditate
  override def requestStop(): Unit = {
    studentNeedsToMeditate = true
  }

}

