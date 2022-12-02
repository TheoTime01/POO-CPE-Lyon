package tp.model.agents;

import java.awt.Point;

import tp.model.comportements.Hebergeur;

public class Abeille extends Animal implements Hebergeur {
    public Abeille(Sexe sexe, Point coord) {
        super(sexe, coord);
    }

    public Abeille(Sexe sexe) {
        super(sexe);
    }

    public Abeille() {
    }

    @Override
    public boolean peutAccueillir(Agent a) {
        // Renvoie true si la classe de l'agent est Verroa
        if (a.getClass().getSimpleName().equals("Varroa")) {
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public boolean accueillir(Agent a) {
        // TODO Auto-generated method stub
        return false;
    }

    
}