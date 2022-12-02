package tp.model.agents;

import java.awt.Point;

public class Agent {
    private static int currentId = 0;
	/** identifiant unique de l'animal*/
	protected int id;
	/** age en unité de temps*/
	protected int age;
	/** position sur la carte*/
	protected Point coord;
	/** état de santé de l'animal */
	private Etat etat = Etat.Normal;
	protected Sexe sexe;
	private Sexe Assexue;

	/**
	 * Renvoie un identifiant unique non encore utilisé
	 * @return un identifiant entier unique d'animal
	 */
	protected static int getUniqueId() {
		//TODO 
		return currentId++;
	}

	@Override
	public String toString() {
		return  getClass().getSimpleName() + " "+ id + " (" + sexe + " (" + this.getCoord().x + ";" + this.getCoord().y + ")" + ")";  
	}
		/* 
		 * constructeurs 
		 */

	public Point getCoord() {
		return coord;
	}

	public void setCoord(Point coord) {
		this.coord = coord;
	}

	public Sexe getSexe() {
		return sexe;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void vieillir() {
		//TODO fait vieillir l'animal d'une unité de temps
		//une bonne manière de faire, une moins bonne...
		this.setAge(this.getAge()+1);
		
	}

	public Agent() {
		super();
	}

}