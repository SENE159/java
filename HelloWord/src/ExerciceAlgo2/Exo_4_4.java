package ExerciceAlgo2;


import java.util.Scanner;

public class Exo_4_4 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//Affichage du message indiquant d'entrer le nombre de photocopies.
		System.out.println("Veuillez entrer le nombre de photocopies souhaité");
		Integer nombrePhotocopie = scanner.nextInt();

		Double prixTotal;
		Double prixUnitaire;
		
		// On fixe le prix unitaire pour correspondant au nombre de photocopies souhaité.
		if ( nombrePhotocopie > 30) {
			prixUnitaire = 0.08;
		}else if (nombrePhotocopie > 10) {
			prixUnitaire =  0.09;
		}else {
			prixUnitaire = 0.10;
		}
		
		prixTotal = prixUnitaire * nombrePhotocopie;
		
		System.out.println("Le prix total de "+nombrePhotocopie+" est de "+prixTotal+"€.");
		//System.out.format("Le prix total de %d est de %.2f€.", nombrePhotocopie, prixTotal);
	}
}
