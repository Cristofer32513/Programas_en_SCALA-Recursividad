import scala.annotation.tailrec

object E4_CocientesDeUnaDivicion {

  @tailrec
  def Cocientes(dividendo:Int, divisor:Int) : Unit = {
    if(dividendo >= divisor) {
      var volver = true
      var dividendo2 = 0
      var posicion = 1

      while (volver) {
        if(dividendo.toString.substring(0, posicion).toInt >= divisor) {
          volver = false
          dividendo2 = dividendo.toString.substring(0, posicion).toInt
        }
        else posicion += 1
      }

      println(dividendo2 / divisor)

      val nuevoDividendo = (dividendo2 % divisor).toString + dividendo.toString.substring(posicion, dividendo.toString.length)
      Cocientes(nuevoDividendo.toInt, divisor)
    }
  }

  def main(args: Array[String]): Unit = {
    val dividendo = 50
    val divisor = 3
    println("El cociente en partes de " + dividendo + " / " + divisor + " es:")
    Cocientes(dividendo, divisor)
  }
}
