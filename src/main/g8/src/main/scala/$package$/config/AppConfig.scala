/**
  * Configuration utils
  */

package $package$.config

import pureconfig.generic.auto._
import scala.reflect.ClassTag

// config classes
case class CookieSettings(domain: String, path: String, ttl: Int)

object ConfigUtils {

  /*
  def initConfig(conf: Config): AppSettings = {
    conf.as[AppSettings]("$package$") match {
      case Right(c) => c
      case _ => throw new Exception("invalid configuration")
    }
  }
   */
  /**
    * loads a configuration case class
    */
  def loadAppConfig[A](path: String)(implicit ev: pureconfig.Derivation[pureconfig.ConfigReader[A]], tag: ClassTag[A]): A = {
    pureconfig.loadConfig[A](path) match {
      case Left(ex) =>  {
        ex.toList.foreach(println)
        throw new Exception("invalid configuration")
      }
      case Right(c: A) => c
    }
  }

}
