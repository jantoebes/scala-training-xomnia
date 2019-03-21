/** **********************************************/
/** Tip: before you start with these exercises **/
/** read the corresponding chapter in the docs **/
/** **********************************************/

//scalaTest("mixedTypeKeysMaps", () => {
//  val res0: String = ???
//  val res1: String = ???
//
//  val myMap = Map("Ann Arbor" → "MI", 49931 → "MI")
//  myMap("Ann Arbor") should be(res0)
//  myMap(49931) should be(res1)
//})
class ex_08_sets extends ScalaTestWrapper {
  /** Sets can be created easily:
    */
  scalaTest("noDuplicatesSets", () => {
    val res0: Int = ???
    val mySet = Set("Michigan", "Ohio", "Wisconsin", "Iowa")
    mySet.size should be(res0)
  })

  /** Sets contain distinct values:
    */
  scalaTest("distinctValuesSets", () => {
    val res0: Int = ???
    val mySet = Set("Michigan", "Ohio", "Wisconsin", "Michigan")
    mySet.size should be(res0)
  })

  /** Sets can be added to easily:
    */
  scalaTest("easilyAddedSets", () => {
    val res0: Boolean = ???
    val res1: Boolean = ???
    val mySet = Set("Michigan", "Ohio", "Wisconsin", "Iowa")
    val aNewSet = mySet + "Illinois"

    aNewSet.contains("Illinois") should be(res0)
    mySet.contains("Illinois") should be(res1)
  })

  /** Sets may be of mixed type:
    */
  scalaTest("mixedTypeSets", () => {
    val res0: Boolean = ???
    val res1: Boolean = ???
    val mySet = Set("Michigan", "Ohio", 12)

    mySet.contains(12) should be(res0)
    mySet.contains("MI") should be(res1)
  })

  /** Sets can be checked for member existence:
    */
  scalaTest("checkExistenceSets", () => {
    val res0: Boolean = ???
    val res1: Boolean = ???
    val mySet = Set("Michigan", "Ohio", 12)

    mySet(12) should be(res0)
    mySet("MI") should be(res1)
  })

  /** Set elements can be removed easily:
    */
  scalaTest("easilyRemovedSets", () => {
    val res0: Boolean = ???
    val res1: Boolean = ???
    val mySet = Set("Michigan", "Ohio", "Wisconsin", "Iowa")
    val aNewSet = mySet - "Michigan"

    aNewSet.contains("Michigan") should be(res0)
    mySet.contains("Michigan") should be(res1)
  })

  /** Set elements can be removed in multiple:
    */
  scalaTest("multipleRemovingSets", () => {
    val res0: Boolean = ???
    val res1: Boolean = ???
    val res2: Int = ???
    val mySet = Set("Michigan", "Ohio", "Wisconsin", "Iowa")
    val aNewSet = mySet -- List("Michigan", "Ohio")

    aNewSet.contains("Michigan") should be(res0)
    aNewSet.contains("Wisconsin") should be(res1)
    aNewSet.size should be(res2)
  })

  /** Set elements can be removed with a tuple:
    */
  scalaTest("tupleRemovingSets", () => {
    val res0: Boolean = ???
    val res1: Boolean = ???
    val res2: Int = ???
    val mySet = Set("Michigan", "Ohio", "Wisconsin", "Iowa")
    val aNewSet = mySet - ("Michigan", "Ohio") // Notice: single '-' operator for tuples

    aNewSet.contains("Michigan") should be(res0)
    aNewSet.contains("Wisconsin") should be(res1)
    aNewSet.size should be(res2)
  })

  /** Two sets can be intersected easily:
    */
  scalaTest("easilyIntersectedSets", () => {
    val res0: Boolean = ???
    val mySet1 = Set("Michigan", "Ohio", "Wisconsin", "Iowa")
    val mySet2 = Set("Wisconsin", "Michigan", "Minnesota")
    val aNewSet = mySet1 intersect mySet2
    // NOTE: Scala 2.7 used **, deprecated for & or intersect in Scala 2.8

    aNewSet.equals(Set("Michigan", "Wisconsin")) should be(res0)
  })

  /** Two sets can be joined as their union easily:
    */
  scalaTest("easilyJoinedSets", () => {
    val res0: Boolean = ???
    val mySet1 = Set("Michigan", "Ohio", "Wisconsin", "Iowa")
    val mySet2 = Set("Wisconsin", "Michigan", "Minnesota")
    val aNewSet = mySet1 union mySet2 // NOTE: You can also use the "|" operator

    aNewSet.equals(Set("Michigan", "Wisconsin", "Ohio", "Iowa", "Minnesota")) should be(res0)
  })

  /** A set is either a subset of another set or it isn't:
    */
  scalaTest("subsetSets", () => {
    val res0: Boolean = ???
    val res1: Boolean = ???
    val mySet1 = Set("Michigan", "Ohio", "Wisconsin", "Iowa")
    val mySet2 = Set("Wisconsin", "Michigan", "Minnesota")
    val mySet3 = Set("Wisconsin", "Michigan")

    mySet2 subsetOf mySet1 should be(res0)
    mySet3 subsetOf mySet1 should be(res1)
  })

  /** The difference between two sets can be obtained easily:
    */
  scalaTest("easilyObtainedDifferencesSets", () => {
    val res0: Boolean = ???
    val mySet1 = Set("Michigan", "Ohio", "Wisconsin", "Iowa")
    val mySet2 = Set("Wisconsin", "Michigan")
    val aNewSet = mySet1 diff mySet2 // Note: you can use the "&~" operator if you *really* want to.

    aNewSet.equals(Set("Ohio", "Iowa")) should be(res0)
  })

  /** Set equivalency is independent of order:
    */
  scalaTest("equivalencySets", () => {
    val res0: Boolean = ???
    val mySet1 = Set("Michigan", "Ohio", "Wisconsin", "Iowa")
    val mySet2 = Set("Wisconsin", "Michigan", "Ohio", "Iowa")

    mySet1.equals(mySet2) should be(res0)
  })

}
