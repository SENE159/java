package ExoFonction;

import java.util.Scanner;

public class Exo6 {

	public static Profil recuperationInformation() {
		Profil p = new Profil();
		Scanner clavier = new Scanner(System.in);
		System.out.println("Entr�e votre prenom");
	    String prenom = clavier.nextLine();
	    
	    p.prenom = prenom;
		
		System.out.println("Entr�e votre nom");
		String nom = clavier.nextLine();
		
		p.nom = nom;
		
		System.out.println("Entr�e votre revenu mensuel");
		int revenumensuel = clavier.nextInt();
		
		p.revenumensuel = revenumensuel;
		 
		return p;
	}
		public static void traitementInformation(Profil p) {
			
		  
			
			 if (p.revenumensuel > 2000) {
				System.out.println("M."+p.nom +p.prenom+ " ne beneficie pas des aides de l'�tat");
			} else  {
				System.out.println("M."+p.nom +p.prenom+ " peut beneficier des aides de l'�tat");
			}
		
	}
		
		public static void main(String[] args) {
			Profil resultat = recuperationInformation();
			traitementInformation (resultat);
			
	}
		
		
		
			
		}


