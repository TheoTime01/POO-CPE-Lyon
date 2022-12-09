package tp.model.agents.Animaux;

import java.awt.Point;

import tp.model.agents.Animal;
import tp.model.agents.Sexe;

public class Varroa extends Animal {
    public Varroa(Sexe sexe, Point coord) {
        super(sexe, coord);
    }

    public Varroa(Sexe sexe) {
        super(sexe);
    }

    public Varroa() {
    }
}
