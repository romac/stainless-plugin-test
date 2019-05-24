import stainless.lang._
import stainless.annotation._

object Main {

  def test = {
    1 + 1 == 2
  }.holds

  @ignore
  def main(args: Array[String]): Unit = {
    println(test)
  }

}
