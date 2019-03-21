/************************************************/
/** Tip: before you start with these exercises **/
/** read the corresponding chapter in the docs **/
/************************************************/

class ex_10_caseclasses extends ScalaTestWrapper {
  /**
    * Case classes have an automatic equals method that works:
    */
  scalaTest("caseClassesSupportEquality", () => {
    val res0: Boolean = ???
    val res1: Boolean = ???
    val res2: Boolean = ???
    val res3: Boolean = ???
    case class Person(first: String, last: String)

    val p1 = new Person("Fred", "Jones")
    val p2 = new Person("Shaggy", "Rogers")
    val p3 = new Person("Fred", "Jones")

    (p1 == p2) should be(res0)
    (p1 == p3) should be(res1)

    (p1 eq p2) should be(res2)
    (p1 eq p3) should be(res3) // not identical, merely equal
  })

  /** Case classes have an automatic hashcode method that works:
    */
  scalaTest("hashcodeMethodCaseClasses", () => {
    val res0: Boolean = ???
    val res1: Boolean = ???
    case class Person(first: String, last: String)

    val p1 = new Person("Fred", "Jones")
    val p2 = new Person("Shaggy", "Rogers")
    val p3 = new Person("Fred", "Jones")

    (p1.hashCode == p2.hashCode) should be(res0)
    (p1.hashCode == p3.hashCode) should be(res1)
  })

  /** Case classes can be created in a convenient way:
    */
  scalaTest("creationCaseClasses", () => {
    val res0: Boolean = ???
    val res1: Boolean = ???
    val res2: Boolean = ???
    case class Dog(name: String, breed: String)

    val d1 = Dog("Scooby", "Doberman")
    val d2 = Dog("Rex", "Custom")
    val d3 = new Dog("Scooby", "Doberman") // the old way of creating using new

    (d1 == d3) should be(res0)
    (d1 == d2) should be(res1)
    (d2 == d3) should be(res2)
  })

  /** Case classes have a convenient toString method defined:
    */
  scalaTest("toStringMethodCaseClasses", () => {
    val res0: String = ???
    case class Dog(name: String, breed: String)
    val d1 = Dog("Scooby", "Doberman")
    d1.toString should be(res0)
  })

  /** Case classes have automatic properties:
    */
  scalaTest("propertiesCaseClasses", () => {
    val res0: String = ???
    val res1: String = ???

    case class Dog(name: String, breed: String)

    val d1 = Dog("Scooby", "Doberman")
    d1.name should be(res0)
    d1.breed should be(res1)
  })

  /** Case classes can have mutable properties:
    */
  scalaTest("mutablePropertiesCaseClasses", () => {
    val res0: String = ???
    val res1: String = ???
    val res2: String = ???
    val res3: String = ???
    case class Dog(var name: String, breed: String) // you can rename a dog, but change its breed? nah!
    val d1 = Dog("Scooby", "Doberman")

    d1.name should be(res0)
    d1.breed should be(res1)

    d1.name = "Scooby Doo" // but is it a good idea?

    d1.name should be(res2)
    d1.breed should be(res3)
  })

  /** There are safer alternatives for altering case classes:
    */
  scalaTest("alteringCaseClasses", () => {
    val res0: String = ???
    val res1: String = ???
    val res2: String = ???
    val res3: String = ???
    case class Dog(name: String, breed: String) // Doberman

    val d1 = Dog("Scooby", "Doberman")

    val d2 = d1.copy(name = "Scooby Doo") // copy the case class but change the name in the copy

    d1.name should be(res0) // original left alone
    d1.breed should be(res1)

    d2.name should be(res2)
    d2.breed should be(res3) // copied from the original
  })

}
