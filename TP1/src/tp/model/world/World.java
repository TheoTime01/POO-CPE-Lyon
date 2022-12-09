package tp.model.world;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

import tp.model.agents.*;
import tp.model.agents.Animaux.Abeille;
import tp.model.agents.Animaux.Frelons;
import tp.model.agents.Animaux.Varroa;
import tp.model.agents.Vegetaux.*;

public class World {

	public World() {
		// TODO Auto-generated constructor stub
	
		}

    public void run()
    {

        // Initialisation
        int nb_cycles = 10;
        int nb_Animal = 1;
        List <Animal> animaux_list = new ArrayList<Animal>();
        List <Abeille> abeilles_list = new ArrayList<Abeille>();
        List <Vegetal> vegetaux_list = new ArrayList<Vegetal>();

        // Création des Animaux et Végétaux
        for (int i = 0; i < nb_Animal; i++) {
            Abeille a = new Abeille((Sexe.Femelle),new Point(26,26));
            // FrelonAsiatique b = new FrelonAsiatique((Sexe.Femelle),new Point(25,25));
            // FrelonEuropeen c = new FrelonEuropeen((Sexe.Femelle),new Point(24,24));
            Varroa v1 = new Varroa((Sexe.Femelle),new Point(25,25));

            Fleur f = new Fleur();
            vegetaux_list.add(f);

            Arbre arbre = new Arbre();
            vegetaux_list.add(arbre);

            animaux_list.add(a);
            abeilles_list.add(a);
            animaux_list.add(v1);
            

        }

        // Application du cycle à tous les Animaux
        int i=0;
        while (i < nb_cycles) {
            System.out.println("Cycle " + i);

            // Animaux
            for (Animal a : animaux_list) {

                // Fonctionnalités de base
                a.seDeplacer();
                a.vieillir();

                // Si une varroa a parasité une abeille, elle se déplace avec l'abeille
                for (Abeille abeille : abeilles_list){
                    if (abeille.accueillir(a) == true){
                        // on vérifie que la varroa est bien dans la liste des parasites de l'abeille
                        a.setCoord(abeille.getCoord());
                    }
                }

                System.out.println(a);

                // System.out.println(a.getAge());
                
                // Fonctionnalités spécifiques

                // 1. Abeille : si une abeille rencontre un frelon, le niveau de santé de l'abeille passe à EnDetresse
                if (a.getClass().getSimpleName().equals("Abeille")) {
                    for (Animal b : animaux_list) {
                        if (b.getClass().getSimpleName().equals("FrelonAsiatique")) {
                            if (a.getCoord().equals(b.getCoord())) {
                                a.setEtat(Etat.EnDetresse);
                                System.out.println(a.getEtat());
                            }
                        }
                    }
                }

                // 2. Si un frelon asiatique rencontre un frelon européen, son niveau de santé passe à EnDetresse
                if (a.getClass().getSimpleName().equals("FrelonAsiatique")) {
                    for (Animal b : animaux_list) {
                        if (b.getClass().getSimpleName().equals("FrelonEuropeen")) {
                            if (a.getCoord().equals(b.getCoord())) {
                                a.setEtat(Etat.EnDetresse);
                                System.out.println(a.getEtat());
                            }
                        }
                    }
                }

                // 3.  Si un frelon a faim, le niveau de santé de sa proie passe à mourant et le frelon la mange.
                if (a instanceof Frelons) {
                    for (Animal b : animaux_list) {
                        if (b.getClass().getSimpleName().equals("Abeille")) { // TODO : ajouter les autres classes d'animaux proies
                            if (a.getCoord().equals(b.getCoord())) {
                                if (a.isFaim()) {
                                    b.setEtat(Etat.Mourant);
                                    System.out.println(b.getEtat());
                                    // a.manger(b); // TODO
                                }
                            }
                        }
                    }
                }

                // 4. Si une abeille rencontre un Varroa et qu'elle nest pas déja parasitée, elle devient parasitée
                // a. Son niveau de santé diminue de 1
                // b. le Varroa se déplace sur la même case que l'abeille
                // c. une fois parasitée, l'abeille ne peut pas de se débarasser du Varroa
                if (a.getClass().getSimpleName().equals("Varroa")) {
                    for (Abeille abeille : abeilles_list) {
                        if (a.getCoord().equals(abeille.getCoord())) {
                            if (abeille.peutAccueillir(a)){
                                abeille.setNiveauSante(abeille.getNiveauSante()-1);
                                System.out.println("Abeille parasitée");
                                System.out.println(abeille.getNiveauSante());
                            }
                        }
                    }
                }

                // Si une abeille rencontre un vegetal , on lui aplique la fonction seNourrir()
                // Sinon, son état de santé se dégrade

                if (a.getClass().getSimpleName().equals("Abeille")) {
                    for (Vegetal v : vegetaux_list) {
                        if (a.getCoord().equals(v.getCoord())) {
                            ((Abeille) a).seNourrir();
                        }
                        else {
                            a.setNiveauSante(a.getNiveauSante()-1);
                        }
                    }
                }

            }

            // Vegetaux
            for (Vegetal v : vegetaux_list) {
                if (v.getClass().getSimpleName().equals("Fleur")) {
                    ((Fleur) v).produireNectar();
                    System.out.println("La fleur produit du nectar " + v.getPortionNectar());
                }
                else if (v.getClass().getSimpleName().equals("Arbre")) {
                    ((Arbre) v).produireNectar();
                    System.out.println("L'arbre produit du nectar " + v.getPortionNectar());
                }
            }


            System.out.println("*************");
            // Add 1 sec delay
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            i++;
        }
    }
}