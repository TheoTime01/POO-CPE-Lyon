package tp.model.agents.Vegetaux;

public class Fleur extends Vegetal {

    public Fleur() {
    }

    public void produireNectar() {
        this.setPortionNectar(this.getPortionNectar() + 1);
    }
}
