object E1_Sumatoria {

  def Sumatoria(desde:Int, hasta:Int) : Int = {
    if (desde < hasta) {
      print(desde + " + ")
      desde + Sumatoria(desde + 1, hasta)
    }
    else {
      print(desde + " = \n")
      desde
    }
  }

  def main(args: Array[String]): Unit = {
    println(Sumatoria(1,20))
  }
}
