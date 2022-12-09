package tp.model.agents.Animaux;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

import tp.model.agents.Agent;
import tp.model.agents.Animal;
import tp.model.agents.Sexe;
import tp.model.comportements.Hebergeur;

public class Abeille extends Animal implements Hebergeur {

    protected boolean parasite = false;

    public List <Agent> listeHeberge = new ArrayList<Agent>();

    public Abeille(Sexe sexe, Point coord) {
        super(sexe, coord);
    }

    public Abeille(Sexe sexe) {
        super(sexe);
    }

    public Abeille() {
    }

    /** 
     * @param a
     * @return boolean
     */
    @Override
    public boolean peutAccueillir(Agent a) {
        // Renvoie true si la classe de l'agent est Verroa
        if (parasite == false){
            if (a.getClass().getSimpleName().equals("Varroa")) {
                listeHeberge.add(a);
                return true;
            }
        }
        return false;
    }

    /** 
     * @param a
     * @return boolean
     */
    @Override
    public boolean accueillir(Agent a) {
        // Renvoie true si l'agent est présent dans la liste des hébergés
        
        // On vérifie que la liste des hébergés n'est pas vide
        if (!(listeHeberge.isEmpty())) {
            if (listeHeberge.contains(a)) {
                return true;
            }
        }
        return false;
    }

    public void seNourrir() {
        this.ameliorerEtat();
    }
}