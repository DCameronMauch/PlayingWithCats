package PlayingWithCats.Eq

import cats._
import cats.implicits._

object Sandbox {
  def go: Unit = {
    println(s"""123 == 123 -> ${123 == 123}""")
    println(s"""123 == "123" -> ${123 == "123"}""") // always false
    println(s"""123 == "123" -> ${123 != "123"}""") // always true
    // println(s"""123 == "123" -> ${123 === "123"}""") -> type error
    // println(s"""123 == "123" -> ${123 =!= "123"}""") -> type error
  }
}
