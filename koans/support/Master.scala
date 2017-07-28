package org.functionalkoans.forscala.support

import org.scalatest.Stopper

object Master extends Stopper {
  var studentNeedsToMeditate = false

  def studentFailed(): Unit = {
    requestStop()
  }

  override def stopRequested: Boolean = studentNeedsToMeditate
  override def requestStop(): Unit = {
    studentNeedsToMeditate = true
  }

}

