package Exercice_Interface;

public class Voiture extends Vehicule implements AMoteur{
	
Integer voiture;

public Voiture() {
	super(vitesse);
	this.voiture = voiture;
}



@Override
public void transporter(Personne p) {
	System.out.println("J'ouvre les porti�res de la voiture pour nettoyer l'int�rieur.");
	
}

public void faireLePlein() {
	System.out.println("Je fais le plein de la voiture");

}
}
