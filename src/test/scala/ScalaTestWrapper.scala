import org.scalatest.exceptions.TestFailedException
import org.scalatest.{FunSuite, Matchers}

trait ScalaTestWrapper extends FunSuite with Matchers {
  private def testWrapper(userTest: () => Unit) = {
    try userTest()
    catch {
      case _: TestFailedException => throw new TestFailedException("Answers are not correct", 0)
    }
  }

  def scalaTest(name: String, userTest: () => Unit): Unit = {
    test(name) {
      testWrapper(userTest)
    }
  }

}
