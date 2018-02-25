/**
  * tests for simple app
  */

package $package$
import org.specs2._

class HelloSpec extends Specification { def is = s2"""
 The string greeting should
   contain at least 5 characters  \$e1
   start with 'hello'           \$e2"""

  val greeting = MainApp.hello("test")
  def e1 = greeting must have size(beGreaterThan(5))
  def e2 = greeting must startWith("Hello")
}
