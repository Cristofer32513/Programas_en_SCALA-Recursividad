object E5_NumeroDeDivisores {
  def Dividores(de:Int) : Int = {
    CalcularDividores(de, 1)
  }

  def CalcularDividores(de:Int, desde:Int) : Int = {
    var num = 0
    if (desde <= de) {
      if (de % desde == 0) num = 1
      num + CalcularDividores(de, desde + 1)
    }
    else num
  }

  def main(args: Array[String]): Unit = {
    val valor = 20
    println(valor + " tiene " + Dividores(valor) + " divisores")
  }
}
