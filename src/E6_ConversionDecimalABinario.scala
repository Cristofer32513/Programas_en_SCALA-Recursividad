object E6_ConversionDecimalABinario {

  def DecimalABinario(valorDecimal:Int): String = {
    if (valorDecimal > 0) DecimalABinario(valorDecimal / 2) + (valorDecimal % 2).toString
    else ""
  }

  def main(args: Array[String]): Unit = {
    val valor = 20
    println("El numero " + valor + " decimal convertido a binario es:")
    println(DecimalABinario(valor))
  }
}
