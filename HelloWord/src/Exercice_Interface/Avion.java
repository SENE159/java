package Exercice_Interface;

public class Avion extends Vehicule implements AMoteur{

	static Integer avion;
	public Avion(Integer vitesse,Integer avion) {
		super(vitesse);
		this.avion = avion;
		
	}

	public Avion() {
		super(avion);
		this.avion = avion;
		
	}

	@Override
	public void transporter(Personne p) {
		System.out.println("Jean prend l'avion ce soir.");
		
	}
	public void faireLePlein() {
		System.out.println("Je fais le plein de l'avion");
		
		
}
}
