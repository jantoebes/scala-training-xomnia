

class Lists extends ScalaTestWrapper {
  /** `eq` tests identity (same object):
    */
  scalaTest("similarToArraysLists", () => {
    val res0: Boolean = ???
    val a = List(1, 2, 3)
    val b = List(1, 2, 3)
    (a eq b) should be(res0)
  })

  /** `==` tests equality (same content):
    */
  scalaTest("sameContentLists", () => {
    val res0: Boolean = ???
    val a = List(1, 2, 3)
    val b = List(1, 2, 3)
    (a == b) should be(res0)
  })

  /** Nil lists are identical, even of different types:
    */
  scalaTest("nilListsLists", () => {
    val res0: Boolean = ???
    val res1: Boolean = ???
    val res2: Boolean = ???
    val res3: Boolean = ???
    val res4: Boolean = ???
    val res5: Boolean = ???

    val a: List[String] = Nil
    val b: List[Int] = Nil

    (a == Nil) should be(res0)
    (a eq Nil) should be(res1)

    (b == Nil) should be(res2)
    (b eq Nil) should be(res3)

    (a == b) should be(res4)
    (a eq b) should be(res5)
  })

  /** Lists can be easily created:
    */
  scalaTest("easilyCreatedLists", () => {
    val res0: Int = ???
    val res1: Int = ???
    val res2: Int = ???
    val a = List(1, 2, 3)
    a should equal(List(res0, res1, res2))
  })

  /** Lists can be accessed via `head`, `headOption` and `tail`. Accessing a list via `head` is unsafe and may result in a `IndexOutOfBoundsException`.
    */
  scalaTest("headAndTailLists", () => {
    val res0: Int = ???
    val res1: Int = ???
    val res2: Int = ???
    val a = List(1, 2, 3)
    a.headOption should equal(Some(res0))
    a.tail should equal(List(res1, res2))
  })

  /** Lists can be accessed by position:
    */
  scalaTest("byPositionLists", () => {
    val res0: Int = ???
    val res1: Int = ???
    val res2: Int = ???
    val a = List(1, 3, 5, 7, 9)
    a(0) should equal(res0)
    a(2) should equal(res1)
    a(4) should equal(res2)

    intercept[IndexOutOfBoundsException] {
      println(a(5))
    }
  })

  /** Lists are immutable:
    */
  scalaTest("areImmutableLists", () => {
    val res0: Int = ???
    val res1: Int = ???
    val res2: Int = ???
    val res3: Int = ???
    val a = List(1, 3, 5, 7, 9)
    val b = a.filterNot(v ⇒ v == 5) // remove where value is 5

    a should equal(List(1, 3, 5, 7, 9))
    b should equal(List(res0, res1, res2, res3))
  })

  /** Lists have many useful utility methods:
    */
  scalaTest("usefulMethodsLists", () => {
    val res0: Int = ???
    val res1: List[Int] = ???
    val res2: List[Int] = ???
    val res3: List[Int] = ???
    val a = List(1, 3, 5, 7, 9)

    // get the length of the list
    a.length should equal(res0)

    // reverse the list
    a.reverse should equal(res1)

    // map a function to double the numbers over the list
    a.map { v ⇒
      v * 2
    } should equal(res2)

    // filter any values divisible by 3 in the list
    a.filter { v ⇒
      v % 3 == 0
    } should equal(res3)
  })

  /** Functions over lists can use _ as shorthand:
    */
  scalaTest("wildcardAsShorthandLists", () => {
    val res0: Int = ???
    val res1: Int = ???
    val res2: Int = ???
    val res3: Int = ???

    val a = List(1, 2, 3)

    a.map {
      _ * 2
    } should equal(List(res0, res1, res2))

    a.filter {
      _ % 2 == 0
    } should equal(List(res3))
  })

  /** Lists can be reduced with a mathematical operation:
    */
  scalaTest("reducingListsLists", () => {
    val res0: Int = ???
    val res1: Int = ???
    val a = List(1, 3, 5, 7)
    a.reduceLeft(_ + _) should equal(res0)
    a.reduceLeft(_ * _) should equal(res1)
  })

  /** `foldLeft` is like `reduce`, but with an explicit starting value:
    */
  scalaTest("foldLeftLists", () => {
    val res0: Int = ???
    val res1: Int = ???
    val res2: Int = ???
    val res3: Int = ???
    val a = List(1, 3, 5, 7)
    // NOTE: foldLeft uses a form called currying that we will explore later
    a.foldLeft(0)(_ + _) should equal(res0)
    a.foldLeft(10)(_ + _) should equal(res1)
    a.foldLeft(1)(_ * _) should equal(res2)
    a.foldLeft(0)(_ * _) should equal(res3)
  })
}
