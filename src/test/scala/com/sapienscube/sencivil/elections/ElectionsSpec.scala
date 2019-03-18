import org.scalatest._

class ElectionsTest extends FunSuite with DiagrammedAssertions {
  test("Electios should start with E") {
    assert("Elections".startsWith("E"))
  }
}