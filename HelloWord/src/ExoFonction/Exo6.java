package ExoFonction;

import java.util.Scanner;

public class Exo6 {

	public static void recuperationInformation() {
		Scanner clavier = new Scanner(System.in);
		System.out.println("Entr�e votre prenom");
	    String prenom = clavier.nextLine();
		
		System.out.println("Entr�e votre nom");
		String nom = clavier.nextLine();
		
		System.out.println("Entr�e votre revenu mensuel");
		int revenumensuel = clavier.nextInt();
		
	}
	
	
	public static void traitementInformation() {
		
		int revenumensuel = 0;
		String prenom ="";
		String nom ="";
		if (revenumensuel > 2000) {
			System.out.println("M."+nom +prenom+ " ne beneficie pas des aides de l'�tat");
		}
	}
		
		public static void main(String[] args) {
			recuperationInformation();
			traitementInformation();
	}

}
