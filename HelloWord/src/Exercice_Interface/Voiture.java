package Exercice_Interface;

public class Voiture extends Vehicule implements AMoteur{
	
Integer voiture;

public Voiture() {
	super(vitesse);
	this.voiture = voiture;
}



@Override
public void transporter(Personne p) {
	System.out.println("J'ouvre les portiéres de la voiture pour nettoyer l'intérieur.");
	
}

public void faireLePlein() {
	System.out.println("Je fais le plein de la voiture");

}
}
