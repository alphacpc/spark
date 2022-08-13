package org.example
package Learning

object StructureControle {

  def main(args : Array[String]) : Unit = {

    println("*******************************************")
    println("************ STRUTURE DE CONTROLE *********")
    println("*******************************************")

    if (1 == 2) {
      print("Vrai")
    } else {
      print("Faux")
    }

    for (i <- 1 to 5) {
      println(f"La valeur de ${i}")
    }

    var i = 20
    while (i <= 100) {
      println(f"La valeur de i dans 'while' => ${i}")
      i += 10
    }

    var age = 18
    age match {
      case 18 => println("Vous avez 18 ans.")
      case x if (x < 18) => println("Vous avez moins de 18 ans.")
      case 19 | 20 => println("Vous avez 19 ou 20 ans.")
      case _ => println("Vous avais plus de 20 ans")
    }

    println("------------- Exercice pour les Structures de controles --------------")

    def randomAge() : Int ={
      val r = scala.util.Random
      r.nextInt(100) //Pour Générer un nombre aléatoire compris de 0 à 100
    }

    val mon_age = randomAge()

    print(f"Votre age est de ${mon_age}ans et ")
    mon_age match {
      case x if ( 0 > x || x < 9) => println("Vous etes un enfant")
      case x if ( 10 >= x || x <= 18) => println("Vous etes un adolescent")
      case x if ( 18 > x || x <= 60) => println("Vous etes un adulte")
      case _ => println("Vous etes papi !!!!")
    }

  }

}
