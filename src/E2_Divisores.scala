import scala.annotation.tailrec

object E2_Divisores {

  def Dividores(de:Int) : Unit = {
    CalcularDividores(de, 1)
  }

  @tailrec
  def CalcularDividores(de:Int, desde:Int) : Unit = {
    if (desde <= de) {
      if (de % desde == 0) println(desde)
      CalcularDividores(de, desde + 1)
    }
  }

  def main(args: Array[String]): Unit = {
    val valor = 20
    println("Los divisores de " + valor + " son:")
    Dividores(valor)
  }
}
