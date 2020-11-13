package Heritage;

import Traitement_perso.Personne;

public class Etudiant extends Personne {
	
	private int numero_carte_etudiant;
	
	public Etudiant() {
this.numero_carte_etudiant = 34567;
}
	public int getNumero_carte_etudiant() {
		return numero_carte_etudiant;
	}

	public void setNumero_carte_etudiant(int numero_carte_etudiant) {
		this.numero_carte_etudiant = numero_carte_etudiant;
	}
	public int prixcartepayer() {
		return 10;
	}
}
