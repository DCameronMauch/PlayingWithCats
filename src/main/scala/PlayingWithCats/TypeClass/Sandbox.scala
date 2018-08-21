package PlayingWithCats.TypeClass

import simulacrum._

@typeclass
trait Width[A] {
  def width(a: A): Int
}

object Width {
  implicit val intHasWidth: Width[Int] = _.toString.length
  implicit val stringHasWidth: Width[String] = _.length
}

import Width.ops._

object Sandbox {
  def go: Unit = {
    println(s"""1.width = ${1.width}""")
    println(s"""12.width = ${12.width}""")
    println(s"""123.width = ${123.width}""")
    println(s""""abc".width = ${"abc".width}""")
  }
}
