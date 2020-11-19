package ExerciceCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JeuDeCarte {
	
	ArrayList<Carte> listeCarte;

	public JeuDeCarte(ArrayList<Carte> listeCarte) {
		this.listeCarte = listeCarte;
	}
	
	public void trier() {
		listeCarte.sort(null);
}  
	public String toString() {
		return "listeCarte"+this.listeCarte;
}
}
