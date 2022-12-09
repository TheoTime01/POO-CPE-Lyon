package tp.model.agents.Vegetaux;

import tp.model.agents.Agent;

public class Vegetal extends Agent{

    public int qteNectar = 0;

    public Vegetal() {
    }

    public int getPortionNectar() {
        return qteNectar;
    }

    public void setPortionNectar(int qteNectar) {
        this.qteNectar = qteNectar;
    }
}