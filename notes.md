# 4.1 Prise en Main

## 4.1.4. Attributs


1.  *Types construits*

2.  *Types primitifs*

3.  *Attributs d'instance:*

    *Attributs de classe:*

4.  *Types Etat et Sexe*


## 4.1.5. Constructeurs

1.  *Quel mot-clef permet de faire référence à l'instance créée ?*

2.  *Un constructeur peut-il se servir d'un autre constructeur ?*

3.  *Peut-on créer un Animal d'âge 25 ? Est-ce une bonne chose ?*
    Oui, en modifiant la variable age
    Peu d'animaux vivent plus de 25 ans en moyenne (sauf les tortues)

4.  *Peut-on créer un animal sans lui indiquer de coordonnées ?*
    *Comment le programme se comporte-t-il ?*

## 4.1.6. Création des accesseurs et des mutateurs

On ne peut pas accéder à la variable sexe car elle est privée

## 4.1.7. Programmation des méthodes d'Animal
Un mutateur rpeut être privé

# 4.2. Spécialisation d'Animal par rapport à sa classe mère Object

1.  *Quelle méthode permet de renvoyer une représentation sous forme de chaîne de caractères d'un objet ? D'où vient-elle ? Quel est son comportement par défaut ?*




2. *Sans modifier la fonction main de Animal, faire en sorte que les instructions*

3. *Comment peut-on récupérer le nom d'une classe ? Regardez la documentation de la classe Class (https://docs.oracle.com/javase/8/docs/api/java/lang/Class.html) et de la méthode getClass(https://docs.oracle.com/javase/8/docs/api/java/lang/Object.html#getClass) de la classe Object ().*

4. *Pourquoi est-il préférable d'utiliser cette manière de faire plus complexe au lieu de d'écrire directement la chaîne « Animal » dans le code ?*

5. *Pourquoi n'y a-t-il pas de différence entre les deux affichages suivants :*
```java
    Animal a = new Animal(); 
    System.out.println(a); 
    System.out.println(a.toString());
```
# 8.3. Compléter le projet avec votre existant

3. pourquoi la méthode sInstaller d'Animal est-elle final ?
--> Pour éviter que les classes filles puissent modifier le comportement de la méthode


4. quel est l'intérêt d'utiliser une interface Deplacable plutôt que de donner une méthode abstraite seDeplacer à la classe Animal ? On parle des méthodes abstraites en deuxième partie (Erreur : source de la référence non trouvée) et cours [100-101]
--> On peut avoir plusieurs classes qui implémentent l'interface Deplacable et qui ont des comportements différents

5. quelle est la différence entre peutAccueillir de Hebergeur et accueillir ? Pourquoi accueillir renvoie-t-elle un booléen ?
--> peutAccueillir est une méthode abstraite qui renvoie un booléen et accueillir est une méthode qui renvoie un booléen et qui est implémentée dans la classe Ruche

6. une abeille domestique a forcément une Ruche comme hébergeur dès sa création. Comment prendre en compte cette contrainte ?
--> On peut créer une méthode accueillir dans la classe Ruche qui prend en paramètre une abeille domestique et qui appelle la méthode accueillir de la classe abeille domestique

# 9.1 Échauffement sur les collections

## 9.1.1.1 Etude de aggraverEtat

1. Quels sont les types concrets de collection utilisés dans l’algorithme ?
--> Des Arrays et des Lists

2. pourquoi parle-t-on des valeurs possible d'une énumération comme d'un EnumSet et non d'une EnumList (ce dernier terme n'existe pas dans l'API java) ?
--> Parce que les énumérations sont des ensembles de valeurs possibles et non des listes de valeurs possibles 

3. quel est l'intérêt d'utiliser un ListIterator plutôt qu'un Iterator simple ?
--> On peut parcourir la liste dans les deux sens et on peut modifier la liste pendant qu'on la parcourt (avec un Iterator simple on ne peut pas modifier la liste pendant qu'on la parcourt)

4. est-on obligé d'utiliser une liste chaînée ? Pourquoi ne pas utiliser une ArrayList ?
--> On peut utiliser une ArrayList mais on ne peut pas modifier la liste pendant qu'on la parcourt

5. pourquoi les méthodes ameliorerEtat() et aggraverEtat() sont-elles final? Qu'est que cela implique ?
--> On ne peut pas modifier le comportement de ces méthodes dans les classes filles 

## 9.2.2. Codage

1. Comment interpréteriez-vous la déclaration ArrayList<? extends Agent> liste;
--> On peut mettre n'importe quel type d'agent dans la liste

2. Que peut contenir cette liste ?
--> Une liste d'agents

3. Quelle méthode renvoie un objet de type Class ?
--> getClass()

4. complétez le constructeur en ajoutant la classe Abeille aux proies du Frelon.
```java
    proies.add(Abeille.class);
```

5. Testez. Pourquoi cela ne fonctionne-t-il pas ? En quoi cette technique diffère de instanceof Abeille ?
--> La méthode est final et on ne peut pas la modifier

## 9.3.2 Algorithmie

5. Pourquoi les abeilles ne sont-elles pas classées par ordre d'insertion dans la collection ?
--> Parce que les abeilles sont triées par ordre alphabétique

6. Quelle modification apporter, et dans quelle classe, pour que les abeilles soient classées par ordre d'identifiant (donc par ordre de création dans le programme) ?
--> On peut créer une méthode compareTo dans la classe Abeille qui compare les identifiants des abeilles et on peut utiliser la méthode sort de la classe Collections pour trier la liste d'abeilles

## 10.1.1. Prise en main
1. quelle collection est utilisée pour contenir les Agents ? est-ce une bonne idée ?
--> Une HashMap est utilisée pour contenir les Agents. C'est une bonne idée car on peut accéder aux agents par leur identifiant
2. grâce à quelle méthode cette collection est-elle initialisée ? A quel endroit ?
--> La collection est initialisée grâce à la méthode probaAgent() de la classe Monde. Cette méthode est appelée dans le constructeur de la classe Monde

## 10.2.1. Comparable

2. Était-ce une bonne idée de choisir un TreeSet plutôt qu'un HashSet pour agents ?
-->  

# 11. Bilan intermédiaire
1. Quel(s) type(s) de collection(s) n'a(ont) pas encore été utilisé(s) pour l'instant ?
--> Les LinkedHashSet et les LinkedHashSet 

# 12.2.1.1. Première approche naïve
1. Créez une méthode gererRencontre() dans le monde qui, pour chacun des agents, renvoie une liste des agents qu'il peut rencontrer (on les appellera les voisins de l'agent).

2. Appeler la méthode rencontrer de l'agent avec chacun de ses voisins.

3. Quels sont les problèmes que posent cette approche ?
--> On parcourt deux fois la liste des agents et on fait des comparaisons inutiles (on compare un agent avec lui-même)

# 12.3.1. Mode nuit et Hebergeurs
Un hebergeur doit donc pouvoir transmettre ses coordonnées.
1. Est-ce un problème d'ajouter une méthode getCoord() à Hebergeur alors que certains Herbergeurs (Agents) ont déjà cette méthode héritée d'Agent ? Pourquoi ?
--> Non, on peut ajouter une méthode getCoord() à Hebergeur car tous les hébergeurs ont des coordonnées et on peut donc ajouter cette méthode à la classe Hebergeur 

2. Qui est responsable du changement de mode ?
--> Le monde est responsable du changement de mode car il est le seul à connaître les agents et il peut donc appeler la méthode changerMode() de chaque agent 

3. implémentez cette fonctionnalité

