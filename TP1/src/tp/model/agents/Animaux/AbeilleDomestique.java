package tp.model.agents.Animaux;

import java.awt.Point;

import tp.model.agents.Sexe;

public class AbeilleDomestique extends Abeille {
    public AbeilleDomestique(Sexe sexe, Point coord) {
        super(sexe, coord);
    }

    public AbeilleDomestique(Sexe sexe) {
        super(sexe);
    }

    public AbeilleDomestique() {
    }
}