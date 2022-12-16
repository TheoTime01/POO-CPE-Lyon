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

3. quel est l'intérêt d'utiliser un ListIterator plutôt qu'un Iterator simple ?

4. est-on obligé d'utiliser une liste chaînée ? Pourquoi ne pas utiliser une ArrayList ?

5. pourquoi les méthodes ameliorerEtat() et aggraverEtat() sont-elles final? Qu'est que cela implique ?
