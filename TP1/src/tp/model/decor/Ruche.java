package tp.model.decor;

import tp.model.agents.Agent;
import tp.model.agents.Animaux.Abeille;
import tp.model.comportements.Hebergeur;
import java.awt.Point;

public class Ruche extends Decor implements Hebergeur {
    public Ruche(Point p) {
        super(p);
    }
    
    @Override
    public boolean peutAccueillir(Agent a) {
        if ( a instanceof Abeille) {
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
