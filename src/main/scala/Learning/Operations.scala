package org.example
package Learning

object Operations {
  def main(args : Array[String]): Unit = {
    /**** Combien de temps (en Jours et en Heure) il faut à un marcheur pour parcourir une distance de 750km à une vitesse de 4.8km ****/
    val distance = 750
    val vitesse = 4.8

    val jour : Int  = ((distance / vitesse ) / 24).toInt
    val reste = ((distance / vitesse ) / 24) - jour
    val heures = (reste * 24).toInt
    val minutes = (((reste * 24) - (reste * 24).toInt) * 60 ).toInt

    println("Combien de temps (en Jours et en Heure) il faut à un marcheur pour parcourir une distance de 750km à une vitesse de 4.8km ?")
    println(f"Il faudrait marcher $jour jour(s) $heures heure(s) $minutes minute(s)")
  }

}
