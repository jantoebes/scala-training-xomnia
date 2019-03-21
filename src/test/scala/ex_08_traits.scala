/************************************************/
/** Tip: before you start with these exercises **/
/** read the corresponding chapter in the docs **/
/************************************************/

class ex_08_traits extends ScalaTestWrapper {
  /**
    * A class uses the `extends` keyword to mixin a trait if it is the only relationship the class inherits:
    */
  scalaTest("similarToInterfacesTraits", () => {
    val res0: String = ???
    case class Event(name: String)

    trait EventListener {
      def listen(event: Event): String
    }

    class MyListener extends EventListener {
      def listen(event: Event): String = {
        event match {
          case Event("Moose Stampede") ⇒
            "An unfortunate moose stampede occurred"
          case _ ⇒ "Nothing of importance occurred"
        }
      }
    }

    val evt = Event("Moose Stampede")
    val myListener = new MyListener
    myListener.listen(evt) should be(res0)
  })

  /** A class can only extend from one class or trait, any subsequent extension should use the keyword `with`:
    */
  scalaTest("extendsFromOneTraits", () => {
    val res0: String = ???
    case class Event(name: String)

    trait EventListener {
      def listen(event: Event): String
    }

    class OurListener

    class MyListener extends OurListener with EventListener {
      def listen(event: Event): String = {
        event match {
          case Event("Woodchuck Stampede") ⇒
            "An unfortunate woodchuck stampede occurred"
          case _ ⇒ "Nothing of importance occurred"
        }
      }
    }

    val evt = Event("Woodchuck Stampede")
    val myListener = new MyListener
    myListener.listen(evt) should be(res0)
  })

  /** Traits are polymorphic. Any type can be referred to by another type if related by extension:
    */
  scalaTest("polymorphicTraits", () => {
    val res0: Boolean = ???
    val res1: Boolean = ???
    val res2: Boolean = ???
    val res3: Boolean = ???
    case class Event(name: String)

    trait EventListener {
      def listen(event: Event): String
    }

    class MyListener extends EventListener {
      def listen(event: Event): String = {
        event match {
          case Event("Moose Stampede") ⇒
            "An unfortunate moose stampede occurred"
          case _ ⇒ "Nothing of importance occurred"
        }
      }
    }

    val myListener = new MyListener

    myListener.isInstanceOf[MyListener] should be(res0)
    myListener.isInstanceOf[EventListener] should be(res1)
    myListener.isInstanceOf[Any] should be(res2)
    myListener.isInstanceOf[AnyRef] should be(res3)
  })

  /** Traits also can use self-types.  A self-type lists the required dependencies for mixing in the trait.  When mixing in the main trait, all self-type dependencies of that trait must also be mixed in, otherwise a compile-time error is thrown.
    *
    * Also, the dependencies can't have identical method/property names or else you'll get an `illegal inheritance` error.
    */
  scalaTest("selfTypeTraits", () => {
    val res0: Int = ???
    trait B {
      def bId = 2
    }

    trait A {
      self: B =>

      def aId = 1
    }

    //val a = new A  //***does not compile!!!***
    val obj = new A with B
    (obj.aId + obj.bId) should be(res0)
  })
}
