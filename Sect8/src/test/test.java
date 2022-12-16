package test;

import java.awt.Point;

import tp.model.agents.Sexe;
import tp.model.agents.Animaux.AbeilleDomestique;
import tp.model.agents.Animal;

public class test {
    public static void main(String[] args) {
        // Test aggraverEtat with the class Abeille
        AbeilleDomestique abeille = new AbeilleDomestique(Sexe.Femelle, new Point(0, 0));
        System.out.println(abeille.getEtat());
        System.out.println("On aggrave l'état de l'abeille...");
        abeille.ameliorerEtat();
        // abeille.aggraverEtat();
        System.out.println(abeille.getEtat());
    }
}