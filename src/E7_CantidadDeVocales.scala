object E7_CantidadDeVocales {

  def ContarVocales(cadena:String) : Int = {
    var num = 0
    if (cadena.nonEmpty) {
      val letra = cadena.substring(cadena.length - 1, cadena.length)

      if (letra.toLowerCase.equals("a") || letra.toLowerCase.equals("e") || letra.toLowerCase.equals("i") ||
          letra.toLowerCase.equals("o") || letra.toLowerCase.equals("u"))
        num = 1
      num + ContarVocales(cadena.substring(0, cadena.length - 1))
    }
    else num
  }

  def main(args: Array[String]): Unit = {
    val cadena = "Cristofer Casas Murillo"
    println("La cadena \"" + cadena + "\" tiene " + ContarVocales(cadena) + " vocales")
  }
}
