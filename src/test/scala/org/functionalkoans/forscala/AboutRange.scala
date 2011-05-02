package org.functionalkoans.forscala

import support.KoanSuite
import support.BlankValues._
import org.scalatest.matchers.ShouldMatchers

class AboutRange extends KoanSuite with ShouldMatchers {

  koan("Range are not inclusive at end of range") {
    val someNumbers = Range(0, 10)

    someNumbers.size should be(__)
  }

  koan("Range can specify increment") {
    val someNumbers = Range(2, 10, 3)

    someNumbers.size should be(__)
  }

  koan("Range can indicate inclusion") {
    val someNumbers = Range(0, 34, 2)
    someNumbers.contains(33) should be(__)
    someNumbers.contains(32) should be(__)
    someNumbers.contains(34) should be(__)
  }

  koan("Range can specify to include value") {
    val someNumbers = Range(0, 34).inclusive

    someNumbers.contains(34) should be(__)
  }

}