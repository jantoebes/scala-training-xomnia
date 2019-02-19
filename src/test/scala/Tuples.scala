import java.util.Date

class Tuples extends ScalaTestWrapper {

  /**
    * As you can see, tuples can be created easily:
    */
  scalaTest("oneIndexedTuples", () => {
    val res0: String = ???
    val res1: String = ???

    val tuple = ("apple", "dog")
    val fruit = tuple._1
    val animal = tuple._2

    fruit should be(res0)
    animal should be(res1)
  })

  /** Tuples may be of mixed type:
    */
  scalaTest("mixedTypeTuples", () => {
    val res0: Int = ???
    val res1: String = ???

    val tuple5 = ("a", 1, 2.2, new Date(), "five")

    tuple5._2 should be(res0)
    tuple5._5 should be(res1)
  })

  /** You can assign multiple variables at once using tuples:
    */
  scalaTest("assignVariablesTuples", () => {
    val res0: String = ???
    val res1: Int = ???
    val res2: Double = ???

    val student = ("Sean Rogers", 21, 3.5)
    val (name, age, gpa) = student

    name should be(res0)
    age should be(res1)
    gpa should be(res2)
  })

  /** The `swap` method can be used to swap the elements of a Tuple2:
    */
  scalaTest("swappedTuples", () => {
    val res0: Int = ???
    val res1: String = ???

    val tuple = ("apple", 3).swap

    tuple._1 should be(res0)
    tuple._2 should be(res1)
  })

}
