package Traitement_perso;
import java.util.Scanner;

public class occuppostpp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner clavier = new Scanner(System.in);

		int occurence = 0;

		System.out.println("Entrée un nombre");
		int n = clavier.nextInt();
		int tab[] = new int [n];

		for (int i = 0; i < tab.length; i++) {
			
			System.out.println("Entrée une valeur à la position " +i+ " : ");
			Scanner clav = new Scanner(System.in);
			tab[i] = clavier.nextInt();
			
		}

		System.out.println("Entrée une valeur");
		int valeur = clavier.nextInt();
		int b =0; // la position de la pplus petite occurence

		for (int i = 0 ; i < tab.length && occurence < 1 ; i++) {
			if (tab[i] == valeur) {
			
			occurence = occurence + 1;
			System.out.println("La position de la derniere occurence : " + i);	
			
	}
			

}
	}
}
