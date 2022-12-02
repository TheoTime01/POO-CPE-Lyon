package launchers;

import java.awt.Point;

import tp.model.agents.*;

import tp.model.decor.*;


public class LauncherTP2 {
	
	public static void main(String [] args){
		Agent a = new Animal(Sexe.Femelle,new Point(25,30));
		Animal b = new AbeilleSolitaire(Sexe.Male,new Point(25,30));
		Arbre c = new Arbre();
		Animal d = new FrelonAsiatique(Sexe.Femelle,new Point(25,30));
		Decor r = new Ruche(new Point(25,30));
		
		//TODO
		//tester la hiérarchie d'agent
		System.out.println("*** Animaux créés: **********");
		System.out.println(a);
		System.out.println(b);
		System.out.println(d);
		System.out.println("***************************");

		// On vérifie que l'abeille peut accueillir un Varroa
		// System.out.println("L'abeille peut accueillir un Varroa: " + ((AbeilleDomestique) b).peutAccueillir(new Varroa()));

		// On vérifie que l'arbre peut accueillir un FrelonAsiatique
		// System.out.println("L'arbre peut accueillir un FrelonAsiatique: " + ((Arbre) c).peutAccueillir(b));

		// On vérifie que la ruche peut accueillir une abeille
		System.out.println("La ruche peut accueillir une abeille: " + ((Ruche) r).peutAccueillir(b));

		// On vérifie que l'abeille peut se déplacer
		// ((AbeilleDomestique) b).seDeplacer();
		// ((AbeilleDomestique) b).seDeplacer();
		// ((AbeilleDomestique) b).seDeplacer();
		// System.out.println("L'abeille se déplace: " + b.getCoord());
	}
}