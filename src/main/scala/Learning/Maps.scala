package org.example
package Learning

object Maps {

  def main(args : Array[String]): Unit = {
    println("***************************************")
    println("******* MANIPULATION DES MAPS *********")
    println("***************************************")

    val maMap = Map("fname" -> "Alpha amadou", "lname" -> "Diallo", "age" -> 26)



    println(maMap)

    println(s"Les clés de ma Map => ${ maMap.keys }")

    println(s"Les valeurs de ma Map => ${ maMap.values }")

    println(f"Récuperer la valeur de la clé prenom => ${ maMap.getOrElse("fname", None) }")

    println(f"Ajout de la clé sex dans ma Map => ${ maMap + ("sex" -> "M") }")

    println(s"Extraire un sous Map => ${ maMap.filter(_._1 == "age") }")

    println(f"La longueur de ma Map => ${ maMap.size }")



    println("\n-------------- Exercice dans Map -----------")

    val weekDay : Map[Int, String] = Map(1 -> "Lundi", 2 -> "mardi", 3-> "mercredi", 4-> "jeudi", 5-> "vendredi", 6-> "samedi", 7-> "dimanche")

    val weekDayKeys = weekDay.keys
    val weekDayKeys1 = weekDayKeys.toList
    val weekDayKeys2 = weekDayKeys1.filter(_ % 2 == 0)
    println(weekDayKeys)
    println(f"Conversion des clés en une Liste => ${weekDayKeys1}")
    println(f"Les element weekDayKeys1 qui soint paires => ${ weekDayKeys2.sorted }")
    weekDayKeys2.foreach(day => println(f"La clef ${day} a pour valeur ${weekDay.getOrElse(day, "None")}"))
    

  }

}
