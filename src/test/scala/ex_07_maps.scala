/** **********************************************/
/** Tip: before you start with these exercises **/
/** read the corresponding chapter in the docs **/
/** **********************************************/

class ex_07_maps extends ScalaTestWrapper {
  /** Maps can be created easily:
    */
  scalaTest("keyAndValueMaps", () => {
    val res0: Int = ???
    val myMap =
      Map("MI" → "Michigan", "OH" → "Ohio", "WI" → "Wisconsin", "IA" → "Iowa")
    myMap.size should be(res0)
  })

  /** Maps do not contain multiple identical pairs
    */
  scalaTest("distinctPairingsMaps", () => {
    val res0: Int = ???
    val myMap = Map("MI" → "Michigan", "OH" → "Ohio", "WI" → "Wisconsin", "MI" → "Michigan")
    myMap.size should be(res0)
  })

  /** Maps can be added to easily:
    */
  scalaTest("easilyAddedMaps", () => {
    val res0: Boolean = ???

    val myMap = Map("MI" → "Michigan", "OH" → "Ohio", "WI" → "Wisconsin", "MI" → "Michigan")
    val aNewMap = myMap + ("IL" → "Illinois")
    aNewMap.contains("IL") should be(res0)
  })

  /** Map values can be iterated:
    */
  scalaTest("canBeIteratedMaps", () => {
    val res0: Int = ???
    val res1: String = ???
    val res2: String = ???

    val myMap = Map("MI" → "Michigan", "OH" → "Ohio", "WI" → "Wisconsin", "MI" → "Michigan")

    val mapValues = myMap.values
    mapValues.size should be(res0)
    mapValues.head should be(res1) //Failed presumption: The order in maps is not guaranteed

    val lastElement = mapValues.last
    lastElement should be(res2) //Failed presumption: The order in maps is not guaranteed

  })

  /** Maps insertion with duplicate key updates previous entry with subsequent value:
    */
  scalaTest("duplicatedKeyInsertionMaps", () => {
    val res0: Int = ???
    val res1: String = ???

    val myMap     = Map("MI" → "Michigan", "OH" → "Ohio", "WI" → "Wisconsin", "MI" → "Meechigan")
    val mapValues = myMap.values
    mapValues.size should be(res0)
    myMap("MI") should be(res1)
  })

  /** Map keys may be of mixed type:
    */
  scalaTest("mixedTypeKeysMaps", () => {
    val res0: String = ???
    val res1: String = ???

    val myMap = Map("Ann Arbor" → "MI", 49931 → "MI")
    myMap("Ann Arbor") should be(res0)
    myMap(49931) should be(res1)
  })

  /** Map elements can be removed easily:
    */
  scalaTest("easilyRemovedMaps", () => {
    val res0: Boolean = ???
    val res1: Boolean = ???

    val myMap =
      Map("MI" → "Michigan", "OH" → "Ohio", "WI" → "Wisconsin", "IA" → "Iowa")
    val aNewMap = myMap - "MI"
    aNewMap.contains("MI") should be(res0)
    myMap.contains("MI") should be(res1)
  })

  /**  Map elements can be removed in multiple:
    */
  scalaTest("removedInMultipleMaps", () => {
    val res0: Boolean = ???
    val res1: Boolean = ???
    val res2: Boolean = ???
    val res3: Int = ???
    val res4: Int = ???
    val myMap =
      Map("MI" → "Michigan", "OH" → "Ohio", "WI" → "Wisconsin", "IA" → "Iowa")
    val aNewMap = myMap -- List("MI", "OH")

    aNewMap.contains("MI") should be(res0)
    myMap.contains("MI") should be(res1)

    aNewMap.contains("WI") should be(res2)
    aNewMap.size should be(res3)
    myMap.size should be(res4)
  })

}
