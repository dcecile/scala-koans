package org.functionalkoans.forscala

import support.KoanSuite

class AboutTraits extends KoanSuite {
  koan("A class uses the extends keyword to mixin a trait if it is the only relationship the class inherits") {
    case class Event(name: String)

    trait EventListener {
      def listen(event: Event): String
    }


    class MyListener extends EventListener {
      def listen(event: Event): String = {
        event match {
          case Event("Moose Stampede") => "An unfortunate moose stampede occurred"
          case _ => "Nothing of importance occurred"
        }
      }
    }

    val evt = Event("Moose Stampede")
    val myListener = new MyListener
    myListener.listen(evt) should be (__)
  }

  koan("A class can only \'extend\' from one class or trait, any subsequent extension should use the keyword \'with\'") {

    case class Event(name: String)

    trait EventListener {
      def listen(event: Event): String
    }

    class OurListener

    class MyListener extends OurListener with EventListener {
      def listen(event: Event) : String = {
        event match {
          case Event("Woodchuck Stampede") => "An unfortunate woodchuck stampede occurred"
          case _ => "Nothing of importance occurred"
        }
      }
    }

    val evt = Event("Woodchuck Stampede")
    val myListener = new MyListener
    myListener.listen(evt) should be (__)
  }

  koan("Traits are polymorphic. Any type can be referred to by another type if related by extension") {
    case class Event(name: String)

    trait EventListener {
      def listen(event: Event): String
    }

    class MyListener extends EventListener {
      def listen(event: Event) : String = {
        event match {
          case Event("Moose Stampede") => "An unfortunate moose stampede occurred"
          case _ => "Nothing of importance occurred"
        }
      }
    }

    val myListener = new MyListener

    myListener.isInstanceOf[MyListener] should be(__)
    myListener.isInstanceOf[EventListener] should be(__)
    myListener.isInstanceOf[Any] should be(__)
    myListener.isInstanceOf[AnyRef] should be(__)
  }

  koan("Traits can have concrete implementations that can be mixed into concrete classes with it's own state") {
    trait Logging {
      var logCache = List[String]()

      def log(value: String) = {
        logCache = logCache :+ value
        println(value)
      }
    }

    class Welder extends Logging {
      def weld() {
        log("welding pipe")
      }
    }

    class Baker extends Logging {
      def bake() {
        log("baking cake")
      }
    }

    val welder = new Welder
    welder.weld()


    val baker = new Baker
    baker.bake()

    welder.logCache.size should be(__)
    baker.logCache.size should be(__)
  }

  koan("Traits are instantiated before a the mixed-in class instantiation") {
    var sb = List[String]()

    trait T1 {
      sb = sb :+ "Instantiated T1"
    }

    class C1 extends T1 {
      sb = sb :+ "Instantiated C1"
    }

    sb = sb :+ "Creating C1"
    new C1
    sb = sb :+ "Created C1"

    sb.mkString(";") should be(__)
  }


  koan("Traits are instantiated before a classes instantiation from left to right") {
    var sb = List[String]()

    trait T1 {
      sb = sb :+ "Instantiated T1"
    }

    trait T2 {
      sb = sb :+ "Instantiated T2"
    }

    class C1 extends T1 with T2 {
      sb = sb :+ "Instantiated C1"
    }

    sb = sb :+ "Creating C1"
    new C1
    sb = sb :+ "Created C1"

    sb.mkString(";") should be(__)
  }

  koan("Instantiations are tracked internally and will not allow a duplicate instantiation. " +
    "Note T1 extends T2, and C1 also extends T2, but T2 is only instantiated once.") {

    var sb = List[String]()

    trait T1 extends T2 {  // Notice: T1 extends T2
      sb = sb :+ "Instantiated T1"
    }

    trait T2 {
      sb = sb :+ "Instantiated T2"
    }

    class C1 extends T1 with T2 {
      sb = sb :+ "Instantiated C1"
    }

    sb = sb :+ "Creating C1"
    new C1
    sb = sb :+ "Created C1"

    sb.mkString(";") should be(__)
  }


  koan("The diamond of death (http://en.wikipedia.org/wiki/Diamond_problem) is avoided since " +
    "instantiations are tracked and will not allow multiple instantiations") {

    var sb = List[String]()

    trait T1 {
      sb = sb :+ "Instantiated T1"
    }

    trait T2 extends T1 {
      sb = sb :+ "Instantiated T2"
    }

    trait T3 extends T1 {
      sb = sb :+ "Instantiated T3"
    }

    class C1 extends T2 with T3 {
      sb = sb :+ "Instantiated C1"
    }

    sb = sb :+ "Creating C1"
    new C1
    sb = sb :+ "Created C1"

    sb.mkString(";") should be(__)
  }
}
