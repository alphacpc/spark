package org.example
package Learning

object SuperFunctions {

  def main(args : Array[String]) : Unit = {

    println("************************************")
    println("*********** LES FONCTIONS **********")
    println("************************************")

    def nb_paires_func(data: List[Int]): Int = {
      var i = 0
      for (a <- 0 to data.length) {
        if (data(a) % 2 == 0) {
          i += 1
        }
      }
      i
    }


    val myList = List(3, 12, 16, 32, 54, 5, 23, 87, 98, 52, 99, 24)

    val nb_paires = myList.count( _ % 2 == 0)


    println(s"Nombre d'élèments paires de la Listes ${myList} => ${nb_paires}")

    val n = nb_paires_func(myList)

    print(n)

  }

}
