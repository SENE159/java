package ExoFonction;

import java.util.Scanner;

public class Exo5 {

	public static Double mafonction() {
		Scanner clavier = new Scanner(System.in);
		Double nombre = clavier.nextDouble();
		System.out.println("Entr�e un nombre");
		System.out.println("la racine carr� de nombre est �gale � : " + Math.sqrt(nombre));
		return Math.sqrt(nombre);
	}
	public static void main(String[] args) {
		Double Stock = mafonction();
		System.out.println(Stock);

	}

}
