package tp.model.agents;

import java.awt.Point;
import java.lang.Math;

/**
 * Cette classe modélise un Animal dans la simulation
 * @author bruno
 *
 */
public class Animal {
	/* attributs de classe */
	private static int currentId = 0;
	
	/* attributs d'instance*/
	/** identifiant unique de l'animal*/
	private int id;
	/** age en unité de temps*/
	private int age;
	/** position sur la carte*/
	private Point coord;
	/** état de santé de l'animal */
	private Etat etat=Etat.Normal;
	private Sexe sexe=Sexe.Assexue;

	@Override
	public String toString() {
	  return "Animal " + id + " (" + sexe + " (" + this.getCoord().x + "," + this.getCoord().y + "))";
	}
	
	/* 
	 * constructeurs 
	 */
	
	public Animal(Sexe sexe, Point coord) {
		age = 0;
		id = Animal.getUniqueId();
		this.sexe=sexe;
		//this.coord=coord;
		this.coord=new Point(coord);
	}
	
	public Animal(Sexe sexe) {
		/* crée un animal avec le sexe passé en paramètre, à la position (0;0), d'âge 0 et lui attribue un id unique
		 * une bonne manière de faire 
		 * en utilisant ce qui existe déjà, une moins bonne
		 */
		this(sexe,new Point(0,0));
	}
	
	public Animal() {
		/* crée un animal de sexe femelle, à la position (0;0), d'âge 0 et lui attribue un id unique
		 * une bonne manière de faire 
		 * en utilisant ce qui existe déjà, une moins bonne
		 */
		this(Sexe.Femelle);
	}
	
	/*
	 *  Accesseurs et mutateurs
	 */

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Point getCoord() {
		return this.coord;
	}

	public void setCoord(Point coord) {
		this.coord = coord;
	}

	public Etat getEtat() {
		return this.etat;
	}

	public void setEtat(Etat etat) {
		this.etat = etat;
	}

	public Sexe getSexe() {
		return this.sexe;
	}

	public void setSexe(Sexe sexe) {
		this.sexe = sexe;
	}
	
	
	/*
	 * Redéfinitions de méthodes d'object
	 */
	//TODO
	

	/* 
	 * comportements d'instance
	 */
	
	

	public void seDeplacer() {
		// utiliser Math.random() pour choisir une direction de déplacement
		// Pour cela, on calcule un dx et un dy de -1,0 ou 1 et on applique les changements sur les coordonnées.
		int max = 1;
		int min = -1;
		int dx = min + (int)(Math.random() * ((max - min) + 1));
		int dy = min + (int)(Math.random() * ((max - min) + 1));
		Point pt = this.getCoord();
		this.setCoord(new Point(pt.x+dx,pt.y+dy));
	}
	
	public void vieillir() {
		// Fait vieillir l'animal d'une unité de temps
		// une bonne manière de faire, une moins bonne...
		this.setAge(this.getAge()+1);
	}
	
	public void rencontrer(Animal a) {
		//TODO
	}
	
	/* comportements de classe */ 
	/**
	 * Renvoie un identifiant unique non encore utilisé
	 * @return un identifiant entier unique d'animal
	 */
	private static int getUniqueId() {
		// create a unique id for the animal;
		return currentId++;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + age;
		result = prime * result + ((coord == null) ? 0 : coord.hashCode());
		result = prime * result + ((etat == null) ? 0 : etat.hashCode());
		result = prime * result + ((sexe == null) ? 0 : sexe.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		if (id != other.id)
			return false;
		if (age != other.age)
			return false;
		if (coord == null) {
			if (other.coord != null)
				return false;
		} else if (!coord.equals(other.coord))
			return false;
		if (etat != other.etat)
			return false;
		if (sexe != other.sexe)
			return false;
		return true;
	}

	

	public static void main(String args[]) {
		//tests unitaires de la classe Animal
		//décommentez les lignes pour approfondir le test unitaire
		//complétez la méthode pour tester les nouvelles fonctionnalités que vous allez implémenter
		Animal a = new Animal();
		Animal b = new Animal(Sexe.Male);
		Animal c = new Animal(Sexe.Assexue);
		Animal d = new Animal(Sexe.Femelle,new Point(25,30));
		Animal e = new Animal(Sexe.Femelle,new Point(25,30));
		
		/*
		 * les lignes suivantes doivent afficher à terme: NomDeLaClasse n° id_animal(sexe, (position x; position y)).
		 * ex: 28 (FEMELLE, (25;30))
		 */
		System.out.println("*** Animaux créés: **********");
		System.out.println(a);
		System.out.println(a.toString());
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		// System.out.println("*** Getters et setters **********");
		// System.out.println(b.getSexe());
		// Sexe ss = b.getSexe();
		// ss=Sexe.Male; 
		// System.out.println(b.getSexe());
		// System.out.println(b.getCoord());
		// Point pt = b.getCoord();
		// pt.x=50;
		// System.out.println(b.getCoord());
		
		//TODO ajoutez vos propres tests de getters et setters
		
		// Test vieillir
		// System.out.println("*** Test de vieux***");
		// System.out.println(b.getAge());
		// //On fait vieillir l'animal
		// b.vieillir();
		// System.out.println(b.getAge());

		
		// Test se Deplacer

		// System.out.println("*** Test de se Deplacer***");
		// System.out.println(b.getCoord());
		// //On fait se déplacer l'animal
		// int N = 10; // nombre de déplacements
		// for (int i=0;i<N;i++) {
		// 	b.seDeplacer();
		// 	System.out.println(b.getCoord());
		// }

		
		// Test id
		// System.out.println(a.getId());
		// System.out.println(b.getId());
		// System.out.println(c.getId());
		// System.out.println(d.getId());
		
		/*
		 * Test comparaison
		 */
		System.out.println("*** Test de comparaison ***");
		System.out.println(d==e);
		System.out.println(d.equals(e));
		System.out.println("Bonjour"=="Bonjour");
		System.out.println("Bonjour".equals("Bonjour"));
	}

}
