package org.example
package Learning

object Tableaux {
  def main(args : Array[String]): Unit = {
    var tab = Array("Pomme", "Banane", "Poissons", "Mangue")

    //Method 1 => To show elements on Tab
    //tab.map(el => println(el))

    //Method 2 => To show elemets on Tab
    tab.foreach(println)

    val tabUpper = tab.map(_.toUpperCase())

    tabUpper.foreach(println)

    val tabLengthFive = tab.filter(element => element.length < 6)

    tabLengthFive.foreach(println)

    println(f"""L'indice de mangue dans 'tab' => ${tab.indexOf("Mangue")}""")

    println(f"""Le nombre d'élèments dans 'tab' => ${tab.size} """)

    println("****************************************************")
    println("************* EXERCICE DE MANIPULATION *************")
    println("****************************************************")

    println("------Suppression d'un element-----")
    tab = tab.filter(el => el != "Poissons")

    tab.foreach(println)

    println("------Rajout d'un Array-----")
    tab = tab ++: Array("Orange", "Papaye")
    tab.foreach(println)

    println("------Taille de Tab-----")
    println(f"""La taille de tab est de : ${tab.size}""")

    println("------Index de manque dans tab-----")
    println(f"""L'indice de 'manque' dans tab => ${tab.indexOf("Mangue")}""")
  }
}
