package org.example
package Learning

object Sets {

  def main(args : Array[String]) :Unit = {
    println("***************************************")
    println("******** MANIPULATION DES SETS ********")
    println("***************************************")

    //Les sets ne prennent pas de doublons, ils sont multi-types
    val maSet = Set(1,2, "Mafe", 'c', None, true, 2)
    val maSetInt : Set[Int] = Set(1, 2, 3, 4)

    println(maSet)
    println(maSetInt)

    val maSetInt2 = maSetInt + 0

    val maSetInt3 = maSetInt2 ++ Set(5,6,7)

    val maSetInt4 = maSetInt3 - 5

    val maSetInt5 = maSetInt3 -- Set(0,2,7)

    println(maSetInt2)

    println(maSetInt3)

    println(maSetInt4)

    println(maSetInt5)

    println("\n-------------- Quelques Opérations -------------")

    println(maSetInt3.mkString("--"))

    println(f"Extraire des elements dans une Set => ${ maSetInt3(4) } -- ${ maSetInt3.take(4) }")

    println(s"Les élèments en communs de deux Sets => ${ maSetInt3.intersect(maSetInt5) }")

    println(f"Les élèments distincts dans deux Sets => ${ maSetInt3.diff(maSetInt5)}")

    println(f"Suppression d'un sous-Set dans un Set => ${ maSetInt3 } --drop(2)--> ${ maSetInt3.drop(2) }")

    println(f"Filter tous les entiers > 4 dans maSetInt3 => ${ maSetInt3.filter( _ > 4) }")

    println("\n------------ Exercice avec les Sets ----------------")
    val superSet = Set("I", "am", "trained", "to","be", "a", "data", "engineer")
    val superSetTransformed = superSet.map( _.length)

    println(superSet)

    println(f"Récupérer la lettre 'a' => ${superSet.intersect(Set("a"))} ---- ${superSet.filter(p => p == "a")}")

    println(f"Transformation des élèments => ${ superSetTransformed }")

    println(f"Filtre des valeurs paires => ${ superSet.filter( _.length % 2 == 0) }")

    println(f"La somme des élèments dans le Set => ${ superSetTransformed.sum  }  ")

  }

}
