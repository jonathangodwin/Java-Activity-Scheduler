Nom : BAKELOULA, Prénom : Jonathan, NumEtu : 22210333 | Nom : IDRES, Prénom : Anis, NumEtu : ???????? 

Toutes les 3 sections ont été faites :-). 


Pour chaque package, il existe un fichier Demo.java :
    *Pour le package schedules.activities, le chemin est schedules/activities/Demo.java
    **Pour le package schedules.basicconstraints, le chemin est schedules/basicconstraints/Demo.java
    ***Pour le package schedules.basictopologicalsort, le chemin est schedules/basictopologicalsort/Demo.java

1- Compilation et exécution des packages
    1.1 Package activities
    *Compilation et exécution de la classe Demo du package activities
    javac -d ../build/ schedules/activities/Demo.java
    java -cp ../build/ schedules.activities.Demo

    **Compilation et exécution de la classe Test du package activities
    javac -d ../build -cp ../lib/schedulestests.jar schedules/activities/Test.java
    java -cp ../build:../lib/schedulestests.jar schedules.activities.Test
    
    1.2 Package basicconstraints
    *Compilation et exécution de la classe Demo du package basicconstraints
    javac -d ../build/ schedules/basicconstraints/Demo.java
    java -cp ../build/ schedules.basicconstraints.Demo

    **Compilation et exécution de la classe Test du package basicconstraints
    javac -d ../build -cp ../lib/schedulestests.jar schedules/basicconstraints/Test.java
    java -cp ../build:../lib/schedulestests.jar schedules.basicconstraints.Test

    1.3 Package basictopologicalsort
    *Compilation et exécution de la classe Demo du package basictopologicalsort
    javac -d ../build/ schedules/basictopologicalsort/Demo.java
    java -cp ../build/ schedules.basictopologicalsort.Demo

    **Compilation et exécution de la classe Test du package basictopologicalsort
    javac -d ../build -cp ../lib/schedulestests.jar schedules/basictopologicalsort/Test.java
    java -cp ../build:../lib/schedulestests.jar schedules.basictopologicalsort.Test

2 - Compléments 
On a fait le tri topologique linéaire, (optionnel) et comparé les vitesses d'exécution des fonctions bruteForceSort() et linearTimeSort() en utilisant java.util.currentTimeMillis()


