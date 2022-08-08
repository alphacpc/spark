package org.example

object Variables {
  def main(args: Array[String]): Unit = {
    var profession = "Data Engineer"
    println("Ma profession est :", profession)
    profession = "Scrum master"
    println("Ma profession est :", profession)

    println(f"Extraire le premier caractère de ma profession : ${profession(0)}")

    println(f"Longueur de la chaine profession est de : ${profession.length}")

    println(f"Extraire une sous-chaine dans profession : ${profession.substring(2,5)}")

    println(f"Vérifier si ma profession contient le mot 'data' : ${profession.contains("\"data\"")}")

    println(f"Compter le nombre de 'm' dans ma profession : ${profession.count(char => char =='m')}")

    println(f"Concatener ma profession avec une autre chaine : ${profession.concat("\"& Data Engineer\"")}")

    println(f"Faire un petit filtre dans ma profession : ${profession.filter(char => char != ' ')}")

    val (prenom, nom, age) = ("Alpha", "diallo", 23)

    println(f"Je m'appelle $prenom $nom et j'ai $age")

    println(f"Je m'appelle $prenom ${nom.toUpperCase()} et j'ai $age")
  }
}
