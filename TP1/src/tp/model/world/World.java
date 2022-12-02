package tp.model.world;

import java.awt.Point;

import tp.model.agents.*;
import tp.model.decor.*;

public class World {

	public World() {
		// TODO Auto-generated constructor stub
	
		}
	
    public void run()
    {
        int i=0;
        Abeille a = new Abeille((Sexe.Femelle),new Point(25,30));
        FrelonAsiatique b = new FrelonAsiatique((Sexe.Male),new Point(26,31));
        
        while ( i < 10) {
            i=i+1;
            a.seDeplacer();
            b.seDeplacer();
            a.vieillir();
            System.out.println(a.getCoord());
            System.out.println(b.getCoord());
            System.out.println(a.getAge());
        }
    }
}