object E1_Sumatoria {

  def Sumatoria(de:Int) : Int = {
    CalcularSumatoria(1, de)
  }

  def CalcularSumatoria(desde:Int, hasta:Int) : Int = {
    if (desde < hasta) {
      print(desde + " + ")
      desde + CalcularSumatoria(desde + 1, hasta)
    }
    else {
      print(desde + " = \n")
      desde
    }
  }

  def main(args: Array[String]): Unit = {
    println(Sumatoria(20))
  }
}
