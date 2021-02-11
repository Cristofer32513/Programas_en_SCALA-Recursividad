object E1_Sumatoria {

  def Sumatoria(de:Int) : Int = {
    CalcularSumatoria(1, de)
  }

  def CalcularSumatoria(desde:Int, hasta:Int) : Int = {
    if (desde < hasta) desde + CalcularSumatoria(desde + 1, hasta)
    else desde
  }

  def main(args: Array[String]): Unit = {
    var valor = 20
    println("La sumatoria de " + valor + " es:")
    println(Sumatoria(20))
  }
}
