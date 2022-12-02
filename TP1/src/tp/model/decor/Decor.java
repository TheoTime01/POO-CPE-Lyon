package tp.model.decor;

import java.awt.Point;


public class Decor {
    	/**
	 * coordonnées de l'élément de décor
	 */
	private Point coord;

	public Decor(Point p) {
		coord = p;

	}
	
	public Point getCoord() {
		return new Point(coord);
	}
}
