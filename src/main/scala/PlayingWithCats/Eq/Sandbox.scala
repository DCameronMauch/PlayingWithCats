package PlayingWithCats.Eq

import cats._
import cats.implicits._

object Sandbox {
  final case class Cat(name: String, age: Int, color: String)

  implicit val catEq: Eq[Cat] = Eq.instance[Cat] {
    (cat1, cat2) => (cat1.name  === cat2.name) &&
                    (cat1.age   === cat2.age) &&
                    (cat1.color === cat2.color)
  }

  val cat1 = Cat("Garfield",   38, "orange and black")
  val cat2 = Cat("Heathcliff", 33, "orange and black")

  def go: Unit = {
    println(123 == 123)
    println(123 == "123") // always false
    println(123 != "123") // always true
    // println(123 === "123") -> type error
    // println(123 =!= "123") -> type error

    val optionCat1 = Option(cat1)
    val optionCat2 = none[Cat]

    println(optionCat1 === optionCat1)
    println(optionCat1 === optionCat2)
  }
}
