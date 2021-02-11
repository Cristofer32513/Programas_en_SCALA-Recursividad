object E2_Divisores {

  def Dividores(de:Int, desde:Int) : Unit = {
    if (desde <= de) {
      if (de % desde == 0) println(desde)
      Dividores(de, desde + 1)
    }
  }

  def main(args: Array[String]): Unit = {
    Dividores(20, 1)
  }
}
