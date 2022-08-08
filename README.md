# **Premier pas avec** *Spark*<
<p>Dans ce repositorie, nous ferons un peu le tour de **SPARK**. En gros on partira du B.A.B 
avec *scala* jusqu'au traitement de données en passant par la manupilation
de divers fichiers (CSV, JSON), aux base de données (Relationnel et NoSQL).</p> 

## **Historique de Spark**
> - Conçu par *Matei Zaharia*, en 2009
> - A l’origine, Spark est une solution pour accélérer le traitement des
    systèmes Hadoop
> - Il est écrit en *Scala*, et fonctionne sous *JVM*
> - Open source sous licence BSD en 2010
> - En 2013, il est passé à la fondation Apache
> - Vainqueur du **Doytonna GraySort Contest**
> - Spark compte +1800 contributeurs dans GITHUB


## **SPARK ?**
> - C'est un framework qui est utilisé pour les systèmes Big Data
> - Assure un traitement **parallèle** et **distribué** des données massives
> - Permet un ensemble de traitement (Streaming et Batch)
> - Spark est une technologie de **traitement**
> - Offre des APIs de haut niveau en Java, Scala, Python et R

## **Composants de Spark**
> 1. Spark Core (Le noyeau de Spark)
> 2. Spark SQL (Pour la manipulation des données structurées)
> 3. Spark Streaming (Le traitement en temps réel avec)
> 4. Spark MLlib (Coté machine learning de Spark)
> 5. Spark GraphX (Traitement de graphes)
> 6. Standalone Scheduler (Le gestionnaire de ressource de Spark)

## **Caractéristiques de Spark**
> - Performance de traitement
> - Tolérance aux pannes (grâce aux RDD)
> - Traitement à la volée (comparé à MapReduce qui ne traite en Batch)
> - Support de plusieurs langages
> - Une communauté active et en expansion
> - Intégration avec Hadoop (grâce aux gestion de ressources avec YARN)
> - Fonctionne en mémoire


## **Resilient Distributed Datasets (RDD)**
*Définition :* Un RDD est une collection de données calculée à partir
d'une source et conservée en mémoire vive.

Les RDD doivent suivre quelques propriétés telles que:

> ● Immuable

> ● Tolérance de panne

> ● Distribué