/**
  * main entry point for application
  */

package $package$

import $package$.config.{ConfigUtils, CookieSettings}
import pureconfig.generic.auto._

object MainApp {

  val COOKIE_CONFIG_PATH="$package$.cookie"

  def hello(name: String): String = s"Hello \${name}"

  def main(args: Array[String]): Unit = {
    val cookie = ConfigUtils.loadAppConfig[CookieSettings](COOKIE_CONFIG_PATH)
    println(s"running application version with ttl: \${cookie.ttl}")
    val message = args.length match {
      case 0 => hello("Anonymous")
      case _ => hello(args(0))
    }
    println(message)
  }
}
