package org.functionalkoans.forscala

import support.KoanSuite

class AboutLiteralNumbers extends KoanSuite {
  koan("Integer Literals are 32-bit and can be created from decimal, hexadecimal") {
    val a = 2
    val b = 31
    val c = 0x30F
    val e = 0
    val f = -2
    val g = -31
    val h = -0x30F
    a should be(__)
    b should be(__)
    c should be(__) //Hint: 30F = 783
    e should be(__)
    f should be(__)
    g should be(__)
    h should be(__) //Hint: 30F = 783
  }

  koan("""Long Literals are 64 bit, are specified by appending an L or l at the end;
         |   l is rarely used since it looks like a 1""") {
    val a = 2L
    val b = 31L
    val c = 0x30FL
    val e = 0L
    val f = -2l
    val g = -31L
    val h = -0x30FL

    a should be(__)
    b should be(__)
    c should be(__) //Hint: 30F = 783
    e should be(__)
    f should be(__)
    g should be(__)
    h should be(__) //Hint: 30F = 783
  }

  koan("""Float and Double Literals are IEEE 754 for specific,
         |   Float are 32-bit length, Doubles are 64-bit.
         |   Floats can be coerced using a f or F suffix, and
         |   Doubles can be coerced using a d or D suffix.
         |   Exponent are specified using e or E.""") {

    val a = 3.0
    val b = 3.00
    val c = 2.73
    val d = 3f
    val e = 3.22d
    val f = 93e-9
    val g = 93E-9
    val h = 0.0
    val i = 9.23E-9D

    a should be(__)
    b should be(__)
    c should be(__)
    d should be(__)
    e should be(__)
    f should be(__)
    g should be(__)
    h should be(__)
    i should be(__)
  }
}
