package org.example
package Learning

object Listes {

  def main(args : Array[String]): Unit = {
    println("****************************************")
    println("******** MANIPULATION DES LISTE ********")
    println("****************************************")



    val freinds : List[String] = List("Samory","Thomas","Kocc barma", "Kanka Moussa")
    val randomers : List[Any] = List("Travis Scott", 8, None, 3.14)
    val top_five =  List(1,2,3,4,5)

    println(freinds)
    println(randomers)
    println(top_five)

    val top_seven = top_five :: List(6,7)

    val started_zero = 0 :: top_five

    val freinders = List.concat(freinds, List("Cheikh Anta", "Nelson Mandela"))

    val freinds_list =  freinders :+ "Therno seydou nourou taal"

    println(top_seven)

    println(started_zero)

    println(freinders)

    println(freinds_list)

    println("******* OPERATIONS SUR LES LISTES *******")

    println(f"Extraire les deux premiers élèments de ma listes freinds_list => ${freinds_list.slice(0,2)}")

    //En fait Take c'est pour extraire un sous liste dans la liste principale
    println(f"Extraire un element via son Index dans freinds_list => ${freinds_list.take(1)}")

    println(f"Extraire un element via son Index dans freinds_list avec la méthode takeRight() => ${freinds_list.takeRight(1)}")

    println(f"Filtrer tous les elements dont la longueur est supérieur à 10 dans la freinds_list => ${ freinds_list.filter(freind => freind.length >= 10) }")

    println(f"Ajout des elements au debut et à la fin de la liste freinds_list => ${ "Chacka Zulu" +: freinds_list :+ "Kwame khrumah" }")

    println(f"Vérifier le contenu de la liste freinds_list => ${ freinds_list.contains("Chacka Zulu") }")

    println(f"Compter le nombre d'élèments dans freinds_list => ${ freinds_list.length }")

    // Sensible à la casse m =!= M
    println(f"Compter le nombre d'elements dans freinds_list avec la lettre 'm' => ${ freinds_list.count(freind => freind.toLowerCase().contains("m") ) }")


    println("\n****************************************")
    println("******** Exercice sur les Listes *********")
    println("******************************************")

    val fruits: List[String] = List("pomme", "banane", "goyave", "banane", "kaki", "pomplemousse")

    val fruits_1 = "ananas" +: fruits :+ "pastèque"

    val fruits_sorted = fruits_1.sorted

    val fruits_small = fruits_sorted.filter(fruit => fruit.length < 5)

    println(fruits)

    println(f"Affichage du 1er et du 3e élèments de la liste fruites => ${ fruits(0) } -- ${ fruits(2) }")

    println(f"La taille de la nouvelle liste => ${ fruits_1.length }")

    println(f"Vérifier que 'goyage' fait partie de la liste fruits_1 => ${ fruits.contains("goyave") }")

    println(s"Le trie des fruits dans fruits_sorted => ${fruits_sorted}")

    println(f"La liste des fruites dont la taille ne dépasse pas 5 caractéres => ${fruits_small}")

  }

}
