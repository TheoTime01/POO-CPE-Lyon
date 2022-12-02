package tp.model.agents;

import java.awt.Point;
import java.lang.Math;

/**
 * Cette classe modélise un Animal dans la simulation
 * @author bruno
 *
 */
public class Animal extends Agent {
	public Animal(Sexe sexe, Point coord) {
		age = 0;
		id = Animal.getUniqueId();
		this.sexe=sexe;
		//this.coord=coord;
		this.coord=new Point(coord);
	}
	
	public Animal(Sexe sexe) {
		//TODO
		/* crée un animal avec le sexe passé en paramètre, à la position (0;0), d'âge 0 et lui attribue un id unique
		 * une bonne manière de faire 
		 * en utilisant ce qui existe déjà, une moins bonne
		 */
		this(sexe,new Point(0,0));
	}
	
	public Animal() {
		//TODO
		/* crée un animal de sexe femelle, à la position (0;0), d'âge 0 et lui attribue un id unique
		 * une bonne manière de faire 
		 * en utilisant ce qui existe déjà, une moins bonne
		 */
		this(Sexe.Femelle);
	}
	
	/*
	 *  Accesseurs et mutateurs
	 */
	//TODO
	
	
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
	

	public boolean rencontrer(Animal a, Animal b) {
		//TODO
		// Si les 2 animaux ont la même position, la fonction renvoie true
		// sinon elle renvoie false
		if (a.getCoord().equals(b.getCoord())) {
			return true;
		}
		return false;
	}
	
	public static void main(String args[]) {
		//tests unitaires de la classe Animal
		//TODO décommentez les lignes pour approfondir le test unitaire
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
		//System.out.println(c);
		System.out.println(d);
		
		System.out.println("*** Getters et setters **********");
		
		System.out.println(d.getSexe());
		Sexe ss = d.getSexe();
		ss=Sexe.Male;
		System.out.println(d.getSexe());
		
		//les lignes suivantes devraient afficher la même chose....
		
		System.out.println(d.getCoord());
		Point pt = d.getCoord();
		System.out.println(d.getCoord());
		
		
		//TODO ajoutez vos propres tests de getters et setters
		
		//TODO test vieillir
		System.out.println(d.getAge());
		d.vieillir();
		System.out.println(d.getAge());
		
		//TODO test seDeplacer

		d.seDeplacer();
		System.out.println(d.getCoord());
		
		//TODO test id
		
		System.out.println(a.getId());
		System.out.println(b.getId());
		System.out.println(c.getId());
		System.out.println(d.getId());
		
		/*
		 * Test comparaison
		 */
		
		System.out.println(d==e);
		System.out.println(d.equals(e));
		System.out.println("Bonjour"=="Bonjour");
		System.out.println("Bonjour".equals("Bonjour"));
		
	}

}