package ExoFonction;

import java.util.Scanner;

public class Exo5 {

	public static Double mafonction() {
		Scanner clavier = new Scanner(System.in);
		Double nombre = clavier.nextDouble();
		System.out.println("Entrée un nombre");
		System.out.println("la racine carré de nombre est égale à : " + Math.sqrt(nombre));
		return Math.sqrt(nombre);
	}
	public static void main(String[] args) {
		Double Stock = mafonction();
		System.out.println(Stock);

	}

}
