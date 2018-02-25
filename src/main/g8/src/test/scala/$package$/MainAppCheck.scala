/**
  * scala checks for simple app
  */

package $package$
import org.specs2._
import org.scalacheck._

class HelloCheck extends Specification with ScalaCheck { def is = s2"""
 The greeting function should
   contain the input string   \$e1
   start with 'hello'         \$e2"""

  def e1 = prop {(input: String) =>
    MainApp.hello(input) must contain(input)
  }
  def e2 = prop {(input: String) =>
    MainApp.hello(input) must startWith("Hello")
  }

}
