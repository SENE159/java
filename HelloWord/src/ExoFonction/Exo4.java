package ExoFonction;

import java.util.Scanner;

public class Exo4 {

	public static void fonction1() {
		Scanner clavier = new Scanner(System.in);
		int nombre = clavier.nextInt();
		System.out.println("Entrée un nombre");
		
		System.out.println("la racine carré de "+ nombre + " est égale à : " + Math.sqrt(nombre));
	}
		
	public static void main(String[] args) {
    fonction1();
	
  
	}

}
