# Java Activity Scheduler (Ordonnanceur d'Activités)

Ce projet est une implémentation en Java d'un système d'ordonnancement d'activités. Il permet de définir des activités (tâches) avec des durées et d'établir différentes contraintes temporelles entre elles. Le cœur du projet est un trieur topologique capable de générer un ordre d'exécution valide et de planifier les activités.

## 🚀 Fonctionnalités

Le projet est divisé en plusieurs modules principaux :

* **Activités** (`schedules.activities`)
    * Définit la classe de base `Activity` qui représente une tâche avec une description et une durée.

* **Contraintes** (`schedules.basicconstraints` / `schedules.factoredconstraints`)
    * Une classe abstraite `BinaryConstraint` pour lier deux activités.
    * `PrecedenceConstraint` : Une activité doit se terminer avant que l'autre ne commence.
    * `MeetConstraint` : Une activité doit se terminer exactement au moment où l'autre commence.
    * `PrecedenceConstraintWithGap` : Une activité doit se terminer, suivie d'un délai minimum et maximum, avant que l'autre ne commence.

* **Tri Topologique** (`schedules.basictopologicalsort`)
    * `TopologicalSorter` : La classe principale qui contient la logique d'ordonnancement.
    * `bruteForceSort` : Une première implémentation d'un tri topologique.
    * `linearTimeSort` : Une implémentation optionnelle et optimisée (en temps linéaire) du tri topologique (basée sur l'algorithme de Kahn).
    * `schedule` : Attribue des dates de début concrètes aux activités en fonction d'une date de départ.

## 📂 Structure des Packages

Le projet est organisé selon les packages suivants, chacun contenant une classe `Demo.java` pour l'exécution et `Test.java` pour les tests unitaires :

* `schedules.activities`
* `schedules.basicconstraints`
* `schedules.basictopologicalsort`

Les classes compilées sont placées dans le répertoire `build/` et les tests dépendent de `lib/schedulestests.jar`.

## ⚙️ Compilation et Exécution

Assurez-vous que le répertoire `build/` existe à la racine du projet (frère du dossier `schedules/`).

### 1. Package `schedules.activities`

* **Compiler et exécuter la Démo :**
    ```bash
    javac -d ../build/ schedules/activities/Demo.java
    java -cp ../build/ schedules.activities.Demo
    ```

* **Compiler et exécuter les Tests :**
    ```bash
    javac -d ../build -cp ../lib/schedulestests.jar schedules/activities/Test.java
    java -cp ../build:../lib/schedulestests.jar schedules.activities.Test
    ```

### 2. Package `schedules.basicconstraints`

* **Compiler et exécuter la Démo :**
    ```bash
    javac -d ../build/ schedules/basicconstraints/Demo.java
    java -cp ../build/ schedules.basicconstraints.Demo
    ```

* **Compiler et exécuter les Tests :**
    ```bash
    javac -d ../build -cp ../lib/schedulestests.jar schedules/basicconstraints/Test.java
    java -cp ../build:../lib/schedulestests.jar schedules.basicconstraints.Test
    ```

### 3. Package `schedules.basictopologicalsort`

* **Compiler et exécuter la Démo :**
    ```bash
    javac -d ../build/ schedules/basictopologicalsort/Demo.java
    java -cp ../build/ schedules.basictopologicalsort.Demo
    ```

* **Compiler et exécuter les Tests :**
    ```bash
    javac -d ../build -cp ../lib/schedulestests.jar schedules/basictopologicalsort/Test.java
    java -cp ../build:../lib/schedulestests.jar schedules.basictopologicalsort.Test
    ```

## 📈 Compléments : Comparaison des Performances

Ce projet inclut deux implémentations du tri topologique :

1.  `bruteForceSort()`
2.  `linearTimeSort()` (Implémentation optionnelle)

Une comparaison des temps d'exécution entre ces 2 méthodes a été effectuée en utilisant `java.util.currentTimeMillis()` pour démontrer l'efficacité de l'algorithme en temps linéaire (O(n+m)) par rapport à l'approche par force brute.
