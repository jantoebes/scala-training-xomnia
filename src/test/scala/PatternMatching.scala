

class PatternMatching extends ScalaTestWrapper {
  /**
    * Pattern matching returns something:
    */
  scalaTest("patternMatchingMechanismPatternMatching", () => {
    val res0: Int = ???
    val stuff = "blue"

    val myStuff = stuff match {
      case "red" ⇒
        println("RED"); 1
      case "blue" ⇒
        println("BLUE"); 2
      case "green" ⇒
        println("GREEN"); 3
      case _ ⇒
        println(stuff); 0 // case _ will trigger if all other cases fail.
    }

    myStuff should be(res0)
  })

  /** Pattern matching can return complex values:
    */
  scalaTest("returnComplexPatternMatching", () => {
    val res0: Int = ???
    val res1: Int = ???
    val res2: Int = ???

    val stuff = "blue"

    val myStuff = stuff match {
      case "red" ⇒ (255, 0, 0)
      case "green" ⇒ (0, 255, 0)
      case "blue" ⇒ (0, 0, 255)
      case _ ⇒ println(stuff); 0
    }

    myStuff should be(res0, res1, res2)
  })

  /** Pattern matching can match complex expressions:
    */
  scalaTest("complexExpressionsPatternMatching", () => {
    val res0: String = ???

    def goldilocks(expr: Any) = expr match {
      case ("porridge", "Papa") ⇒ "Papa eating porridge"
      case ("porridge", "Mama") ⇒ "Mama eating porridge"
      case ("porridge", "Baby") ⇒ "Baby eating porridge"
      case _ ⇒ "what?"
    }

    goldilocks(("porridge", "Mama")) should be(res0)
  })

  /** Pattern matching can wildcard parts of expressions:
    */
  scalaTest("wildcardParsPatternMatching", () => {
    val res0: String = ???
    val res1: String = ???

    def goldilocks(expr: Any) = expr match {
      case ("porridge", _) ⇒ "eating"
      case ("chair", "Mama") ⇒ "sitting"
      case ("bed", "Baby") ⇒ "sleeping"
      case _ ⇒ "what?"
    }

    goldilocks(("porridge", "Papa")) should be(res0)
    goldilocks(("chair", "Mama")) should be(res1)
  })

  /** To pattern match against a `List`, the list can be split into parts, in this case the head `x` and the tail `xs`. Since the case doesn't terminate in `Nil`, `xs` is interpreted as the rest of the list:
    */
  scalaTest("againstListsPatternMatching", () => {
    val res0: Int = ???

    val secondElement = List(1, 2, 3) match {
      case x :: xs ⇒ xs.head
      case _ ⇒ 0
    }

    secondElement should be(res0)
  })

  /** To obtain the second element you can expand on the pattern. Where `x` is the first element, `y` is the second element, and `xs` is the rest:
    */
  scalaTest("againstListsIIPatternMatching", () => {
    val res0: Int = ???
    val secondElement = List(1, 2, 3) match {
      case x :: y :: xs ⇒ y
      case _ ⇒ 0
    }

    secondElement should be(res0)
  })
}
