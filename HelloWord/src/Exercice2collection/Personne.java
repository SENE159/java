package Exercice2collection;

public class Personne extends Object{

	private String nom;
	private String prenom;
	
	public Personne(String nom,String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}
	public String toString() {
		return this.nom + this.prenom;
}
}
