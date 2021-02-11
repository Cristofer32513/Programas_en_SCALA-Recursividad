object E3_Factorial {

  def Factorial(de:Int) : Long = {
    if (de > 1) de * Factorial(de - 1)
    else de
  }

  def main(args: Array[String]): Unit = {
    var valor = 20
    println("Factorial de " + valor + " es:")
    println(Factorial(valor))
  }
}
