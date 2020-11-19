package ExerciceCollections;

import java.util.ArrayList;
import java.util.List;

public class DriveCarte {

	public static void main(String[] args) {
		
		ArrayList<Carte> cartes = new ArrayList<Carte>();
		cartes.add(new Carte("Trefle",1));
		cartes.add(new Carte("Coeur",8));
		cartes.add(new Carte("Trefle",5));
		cartes.add(new Carte("Carreau",13));
		cartes.add(new Carte("Pique",7));
		
		JeuDeCarte jeu = new JeuDeCarte(cartes);
		System.out.println("Affiche avant le tri");
		System.out.println(jeu);
		jeu.trier();
		System.out.println("Affiche aprés le tri");
		System.out.println(jeu);

	}

}
