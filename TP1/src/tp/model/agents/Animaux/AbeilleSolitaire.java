package tp.model.agents.Animaux;

import java.awt.Point;

import tp.model.agents.Sexe;

public class AbeilleSolitaire extends Abeille {
    public AbeilleSolitaire(Sexe sexe, Point coord) {
        super(sexe, coord);
    }

    public AbeilleSolitaire(Sexe sexe) {
        super(sexe);
    }

    public AbeilleSolitaire() {
    }
}