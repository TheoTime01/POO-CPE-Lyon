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

