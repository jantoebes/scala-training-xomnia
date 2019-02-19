

class Classes extends ScalaTestWrapper {
  /**
    * This also demonstrates the use of value parameters in `ClassWithValParameter(val name: String)`, which
    * automatically creates an internal property `val name: String` in the class:
    *
    */
  scalaTest("classWithValParameterClasses", () => {
    val answer0: String = ""

    class ClassWithValParameter(val name: String)

    val aClass = new ClassWithValParameter("Gandalf")

    aClass.name should be(answer0)
  })

}
