package ExoFonction;

import java.util.Scanner;

public class Exo3 {

	public static void fonction1() {
		Scanner clavier = new Scanner(System.in);
		int nombre = clavier.nextInt();
		System.out.println("Entrée un nombre");
		
		int produit = nombre*nombre;
		System.out.println("la multiplication du nombre par lui-méme est égale à : " + produit);
	}
	public static void main(String[] args) {
	fonction1();

	}

}
