import stainless.lang._
import stainless.annotation._

object Main {

  def valid = {
    1 + 1 == 2
  }.holds

  def invalid(n: BigInt) = {
    n == 42
  }.holds

  @ignore
  def main(args: Array[String]): Unit = {
    println(valid)
    println(invalid(1))
  }

}
