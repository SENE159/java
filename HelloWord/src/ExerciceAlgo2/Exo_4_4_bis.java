package ExerciceAlgo2;

import java.util.Scanner;

public class Exo_4_4_bis {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//Affichage du message indiquant d'entrer le nombre de photocopies.
		System.out.println("Veuillez entrer le nombre de photocopies souhaité");
		Integer nombrePhotocopie = scanner.nextInt();

		Double prixTotal = 0.00;
		
		// On fixe le prix unitaire pour correspondant au nombre de photocopies souhaité.
		if ( nombrePhotocopie > 30) {
			prixTotal = (nombrePhotocopie - 30) * 0.08;
			prixTotal = prixTotal + 20*0.09;
			prixTotal = prixTotal + 10*0.10;
			// On peut également regrouper les 3 instructions en une :
			//prixTotal = (nombrePhotocopie - 30) * 0.08 + 20*0.09 + 10*0.10;
		}else if (nombrePhotocopie > 10) {
			prixTotal = (nombrePhotocopie - 10) * 0.09;
			prixTotal = prixTotal + 10*0.10;
		}else {
			prixTotal = nombrePhotocopie * 0.10;
		}
		
		System.out.println("Le prix total de "+nombrePhotocopie+" est de "+prixTotal+"€.");
		System.out.format("Le prix total de %d est de %.2f€.", nombrePhotocopie, prixTotal);
	}
}
