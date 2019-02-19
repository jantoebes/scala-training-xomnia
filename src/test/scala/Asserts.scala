

class Asserts extends ScalaTestWrapper {

  /** Come on, your turn: true and false values can be compared with should matchers:
    */
  scalaTest("scalaTestAsserts", () => {
    val answer0: Boolean = false

    true should be(answer0)
  })

  /** Booleans in asserts can test equality:
    */
  scalaTest("booleanAsserts", () => {
    val answer0: Int = ???

    val v1 = 4
    v1 shouldEqual answer0

    /** `shouldEqual` is an assertion. It is from ScalaTest, not from the Scala language. */
  })

  /** Sometimes we expect you to fill in the values:
    */
  scalaTest("valuesAsserts", () => {
    val answer0: Int = ???

    assert(answer0 == 1 + 1)
  })

}
