package ExerciceAlgo3;
import java.util.Scanner;

public class Exerc5BAlgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner clavier = new Scanner(System.in);
		
		int occurence = 0;
		
		System.out.println("Entr�e un nombre");
		int n = clavier.nextInt();
		int tab[] = new int [n];
		
		for (int i = 0; i < tab.length; i++) {
			
			System.out.println("Entr�e le nombre � la position " + 1 + " :");
			Scanner clav = new Scanner(System.in);
			int nombre = clavier.nextInt();
			
			
		}
		
		System.out.println("Entr�e la valeur � chercher dans le tableau");
		Scanner clavier1 = new Scanner(System.in);
		int valeur = clavier.nextInt();
		
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] == valeur) occurence++;
			
			
			
		}
	int i = 0;
		System.out.println("la tab" + i + " est pr�sente " + i+ " fois dans le tableau");
	}
		
	}



