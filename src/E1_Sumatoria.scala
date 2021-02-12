object E1_Sumatoria {

  def CalcularSumatoria(de:Int) : Int = {
    if (de > 1) de + CalcularSumatoria(de - 1)
    else de
  }

  def main(args: Array[String]): Unit = {
    val valor = 20
    println("La sumatoria de " + valor + " es:")
    println(CalcularSumatoria(valor))
  }
}
