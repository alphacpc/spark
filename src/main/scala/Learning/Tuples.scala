package org.example
package Learning

object Tuples {
  def main(args : Array[String]) : Unit = {

    println("************************************")
    println("*********** LES TUPLES *************")
    println("************************************")

    val maTuple = Tuple3("Diallo", "alpha", 26)

    println(maTuple)

    println(maTuple._1, maTuple._3)


    println("----------------- Exercice  dans les Sets -------------")
    val moi = Tuple4("Alpha", "DIALLO", 1.70, "Masculin")

    println(f"Ma taille est de ${ moi._3 }")

    println(f"Je suis ${moi._1} ${moi._2}, j'ai une taille de ${moi._3}m et de sexe ${moi._4}.")

  }
}
