package sjsexpress;

import scala.scalajs.js.annotation._

@JSExportTopLevel("Main")
@JSExportAll
object Main {
  def greet(name: String): Unit = {
    println(s"Hello $name from scala");
  }

  def main(args: Array[String]): Unit = {
    println("hello world!!!!");
  }
}