package ExerciceAlgo3;
import java.util.Scanner;

public class Exo10Algo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int n = 0;
		int tab [] = new int [n+1];
		int valeur = 0;
		Scanner clavier = new Scanner(System.in);
		System.out.println("Entr�e la valeur � ajouter � la fin du tableau");
		valeur = clavier.nextInt();
		
		for (int i = 0; i < tab.length; i++) {
			
		}
		
		tab[n] = valeur;
		System.out.println("la valeur tab[n] � ajouter � la fin du tableau est : " + tab[n]);
		System.out.println("Entr�e la valeur � ajouter � la moiti� du tableau");
		valeur = clavier.nextInt();
		
		tab[n/2] = valeur;
		System.out.println("la valeur tab[n/2] � ajouter � la moiti� du tableau est : " + tab[n/2]);
		System.out.println("Entr�e la valeur � ajouter au d�but du tableau");
		valeur = clavier.nextInt();
		tab[0] = valeur;
		System.out.println("la valeur tab[0] � ajouter au d�but du tableau est : " + tab[0]);
		}
	}


