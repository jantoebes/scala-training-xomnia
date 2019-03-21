import OptionsHelper._

class Options extends ScalaTestWrapper {

  /** Concept Options
    */
  scalaTest("conceptOptions", () => {
    val answer0: Option[String] = ???
    val answer1: Option[String] = ???

    val someValue: Option[String] = Some("I am wrapped in something")
    someValue should be(answer0)

    val emptyValue: Option[String] = None
    emptyValue should be(answer1)
  })

  /** Let's write a function that may or not give us a string, thus returning `Option[String]`:
    *
    * {{{
    * def maybeItWillReturnSomething(flag: Boolean): Option[String] = {
    *   if (flag) Some("Found value") else None
    * }
    * }}}
    *
    * Using `getOrElse`, we can extract the value if it exists, or return a provided default value.
    * If we have a `Some(x)` we return `x`, and for `None` we return the default value.
    */
  scalaTest("getOrElseOptions", () => {
    val answer0: String = ???
    val answer1: String = ???
    val answer2: String = ???

    val value1: Option[String] = maybeItWillReturnSomething(true)
    val value2: Option[String] = maybeItWillReturnSomething(false)

    value1 getOrElse "No value" should be(answer0)
    value2 getOrElse "No value" should be(answer1)
    value2 getOrElse {
      "default function"
    } should be(answer2)
  })

  scalaTest("isEmptyOptions", () => {
    val answer0: Boolean = ???
    val answer1: Boolean = ???

    val value1 = maybeItWillReturnSomething(true)
    val value2 = maybeItWillReturnSomething(false)

    value1.isEmpty should be(answer0)
    value2.isEmpty should be(answer1)
  })

  /** Option can also be used with pattern matching:
    */
  scalaTest("matchOptions", () => {
    val answer0: Double = ???
    val answer1: Double = ???

    val someValue: Option[Double] = Some(20.0)
    val value = someValue match {
      case Some(v) ⇒ v
      case None ⇒ 0.0
    }
    value should be(answer0)
    val noValue: Option[Double] = None
    val value1 = noValue match {
      case Some(v) ⇒ v
      case None ⇒ 0.0
    }
    value1 should be(answer1)
  })

  /** An alternative for pattern matching is performing collection style operations.
    * This is possible because an option could be looked at as a collection with either one or zero elements.
    *
    * One of these operations is `map`. This operation allows us to map the inner value to a different type while preserving the option:
    */
  scalaTest("mapOptions", () => {
    val answer0: Option[String] = Some("3")
    val answer1: Option[String] = Some("4")

    val number: Option[Int] = Some(3)
    val noNumber: Option[Int] = None
    val result1 = number.map(_ * 1.5)
    val result2 = noNumber.map(_ * 1.5)

    result1 should be(answer0)
    result2 should be(answer1)

    /** Note that the type of result1 is now Option[Double], thanks to the scala type inference. */
  })

  /** Another operation is `fold`. This operation will extract the value from the option, or provide a default if the value is `None`
    */
  scalaTest("foldOptions", () => {
    val answer0: Int = ???
    val answer1: Int = ???

    val number: Option[Int] = Some(3)
    val noNumber: Option[Int] = None
    val result1 = number.fold(1)(_ * 3)
    val result2 = noNumber.fold(1)(_ * 3)

    result1 should be(answer0)
    result2 should be(answer1)
  })
}
