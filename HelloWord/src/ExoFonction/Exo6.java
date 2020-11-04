package ExoFonction;

import java.util.Scanner;

public class Exo6 {

	public static Profil recuperationInformation() {
		Profil p = new Profil();
		Scanner clavier = new Scanner(System.in);
		System.out.println("Entrée votre prenom");
	    String prenom = clavier.nextLine();
	    
	    p.prenom = prenom;
		
		System.out.println("Entrée votre nom");
		String nom = clavier.nextLine();
		
		p.nom = nom;
		
		System.out.println("Entrée votre revenu mensuel");
		int revenumensuel = clavier.nextInt();
		
		p.revenumensuel = revenumensuel;
		 
		return p;
	}
		public static void traitementInformation(Profil p) {
			
		  
			
			 if (p.revenumensuel > 2000) {
				System.out.println("M."+p.nom +p.prenom+ " ne beneficie pas des aides de l'état");
			} else  {
				System.out.println("M."+p.nom +p.prenom+ " peut beneficier des aides de l'état");
			}
		
	}
		
		public static void main(String[] args) {
			Profil resultat = recuperationInformation();
			traitementInformation (resultat);
			
	}
		
		
		
			
		}


