package org.example

object Secret {

  //USER CONNECTION ON POSTGRES
  val connect_PSQL = Map(
    "user" -> "groupe3",
    "password" -> "passer123",
    "db" -> "chickens",
    "table" -> "informations"
  )

  //USER CONNECTION ON POSTGRES
  val connect_MYSQL = Map(
    "user" -> "root",
    "password" -> "root",
    "db" -> "ApiPythonDB",
    "table" -> "Todos"
  )

}
