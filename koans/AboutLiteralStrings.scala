package org.functionalkoans.forscala

import support.KoanSuite

class AboutLiteralStrings extends KoanSuite {

  koan("Character Literals are quoted with single quotes") {
    val a = 'a'
    val b = 'B'

    a.toString should be(__)
    b.toString should be(__)
  }

  koan("Character Literals can use hexadecimal Unicode") {
    val c = '\u0061' //unicode for a

    c.toString should be(__)
  }

  koan("Character Literals can use escape sequences") {
    val e = '\"'
    val f = '\\'

    e.toString should be(__)
    f.toString should be(__)
  }

  koan("One-Line String Literals are surrounded by quotation marks.") {
    val a = "To be or not to be"
    a should be(__)
  }

  koan("String Literals can contain escape sequences.") {
    val a = "An \u0061pple \u0061 d\u0061y keeps the doctor \u0061w\u0061y"
    a should be(__)
  }

  koan("""Multiline String literals
	are surrounded
	by three quotation marks""") {
    val a = """An apple a day
    keeps the doctor away"""
    a.split('\n').size should be(__) //a.split('\n').size determines the number of lines
  }

  koan("Use stripMargin to prettify multi-line strings") {

   /*
	  * Multiline String literals can use | to specify the starting position
	  * of subsequent lines, then use stripMargin to remove the surplus indentation.
	  */

    val a = """An apple a day
               |keeps the doctor away"""
    a.stripMargin.split('\n')(1).charAt(0) should be(__)

   /*
	  * a.stripMargin.split('\n')(1).charAt(0)
    * gets the first character of the second line
	  */
  }
}
