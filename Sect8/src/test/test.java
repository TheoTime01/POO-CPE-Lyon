//NB: This file is not part of the project. It is only used to test the code.
// TODO: Remove this file from the project
// TODO : Be careful of toString order for ruche population, sex, age and position


package test;

import java.awt.Point;
import java.lang.reflect.AnnotatedTypeVariable;

import model.decor.Ruche;
import model.agents.Sexe;
import model.agents.animaux.Abeille;
import model.agents.animaux.AbeilleDomestique;
public class test {
    public static void main(String[] args) {
        // Test aggraverEtat with the class Abeille
        // AbeilleDomestique abeille = new AbeilleDomestique(Sexe.Femelle, new Point(0, 0));
        // System.out.println(abeille.getEtat());
        // System.out.println("On aggrave l'état de l'abeille...");
        // abeille.ameliorerEtat();
        // // abeille.aggraverEtat();
        // System.out.println(abeille.getEtat());

        // Test accueillir with the class Ruche
        // Ruche ruche = new Ruche(new Point(0, 0));
        // Abeille abeille = new AbeilleDomestique(Sexe.Femelle, new Point(0, 0), ruche);
        // Abeille abeille2 = new AbeilleDomestique(Sexe.Femelle, new Point(0, 0), ruche);
        // System.out.println("La ruche peut accueillir l'abeille ? " + ruche.peutAccueillir(abeille));
        // System.out.println("On accueille l'abeille dans la ruche...");
        // ruche.accueillir(abeille);
        // System.out.println(ruche);
        // System.out.println("La ruche peut accueillir l'abeille2 ? " + ruche.peutAccueillir(abeille2));
        // System.out.println("On accueille l'abeille2 dans la ruche...");
        // ruche.accueillir(abeille2);

        // Test accueillir 5 abeilles dans la ruche
        Ruche ruche = new Ruche(new Point(0, 0));
        Abeille abeille = new AbeilleDomestique(Sexe.Femelle, new Point(0, 0), ruche);
        Abeille abeille2 = new AbeilleDomestique(Sexe.Femelle, new Point(0, 0), ruche);
        Abeille abeille3 = new AbeilleDomestique(Sexe.Male, new Point(0, 0), ruche);
        Abeille abeille4 = new AbeilleDomestique(Sexe.Femelle, new Point(0, 0), ruche);
        Abeille abeille5 = new AbeilleDomestique(Sexe.Male, new Point(0, 0), ruche);
        // La ruche doit accueilir toutes les abeilles
        ruche.accueillir(abeille);
        ruche.accueillir(abeille5);
        ruche.accueillir(abeille2);
        ruche.accueillir(abeille4);
        ruche.accueillir(abeille3);
        System.out.println(ruche);
    }
}