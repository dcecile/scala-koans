package org.functionalkoans.forscala

import org.functionalkoans.forscala.support.KoanSuite

import scala.annotation.tailrec

class AboutMethods extends KoanSuite {

  koan( """A method's last statement will be what is returned
          | There is no need for the keyword `return`.
          | When a method includes a `=` after the method declaration that
          | will infer the return type""") {
    def add(x: Int, y: Int) = {
      x + y
    }
    add(6, 7) should be(__)
  }

  koan(
    """If you want to include the return type explicitly,
      | no one will stop you""") {
    def add(x: Int, y: Int): Int = {
      //Notice the :Int at the end of the method
      x + y
    }
    add(2, 10) should be(__)
  }


  koan(
    """If a method returns two different types and no explicit
      | return type is defined,
      | the type of the method will likely be inferred as the
      | common super parent of the two types being returned""") {

    def add(x: Int, y: Int) = {
      //implicitly the return type is Any
      if (x > 10) (x + y).toString
      else x + y
    }

    add(2, 10) should be(__)
    add(1, 1) should be(__)
  }


  koan( """If a method does not of have equal it is considered `Unit` which is analogous to `void` in Java""") {
    def foo(x: Int) { //Note: No `=`
      (x + 4) should be(__)
    }
    foo(5)
  }

  koan(
    """If you want to have an = on the method, while still explicitly returning Unit you can make the return type `Unit`,
      | this also analogous to `void""") {
    def foo(x: Int): Unit = { //Note we are declaring Unit
      (x + 4) should be(__)
    }
    foo(3)
  }

  koan( """Once you have an =, it is understood that there will be a return type and can be inferred""") {
    def foo(x: Int) = 3 + 4
    foo(3).isInstanceOf[Int] should be(__) //.isInstanceOf[...] is analogous to Java's instanceOf
  }

  koan( """Of course if you wish to be explicit about the return type, you can attach it at the end of the method""") {
    def foo(x: Int): Int = 3 + 4
    foo(3).isInstanceOf[Int] should be(__)
  }

  koan(
    """When performing recursion, the
      |return type on the method is mandatory!""") {

    def factorial(x:BigInt):BigInt = { //Notice the return type of BigInt!
      if (x <= 1) 1
      else x * factorial(x-1)
    }

    factorial(4) should be(__) // List(...) is how a list is created more about lists later.

    //Note: Fire up a REPL and paste factorial(100000)!
  }

  koan(
    """If you want to ensure a method is not only recursive but _tail recursive_,
      | you can get help from the scala compiler to ensure that it is indeed a
      | tail recursive call by
      | including scala.annotation.tailrec on the method.  When methods are properly tail recursive. The 
      | Scala compiler will optimize the code from stack recursion into a loop at compile time""") {

    import scala.annotation.tailrec //importing annotation!
    @tailrec
    def fact(i: BigInt, accumulator: BigInt): BigInt = { // This is an accumulator to ensure tail recursion!
      if (i <= 1)
        accumulator
      else
        fact(i - 1, i * accumulator)
    }

    def factorial(i: BigInt): BigInt = {
      fact(i, 1)
    }

    factorial(4) should be(__)

    //Note: Fire up a REPL and try factorial(100000) now!
  }

  koan(
    """In scala, methods can be placed inside in methods! This comes useful for
      | recursion where accumulator helper methods can be placed inside the outer
      |  method, or you just want to place one method in another for design reasons""") {
    def factorial(i: BigInt): BigInt = {
      @tailrec
      def fact(i: BigInt, accumulator: BigInt): BigInt = {
        if (i <= 1)
          accumulator
        else
          fact(i - 1, i * accumulator)
      }
      fact(i, 1)
    }

    factorial(3) should be(6)
  }
}
