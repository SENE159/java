package ExerciceAlgo3;
import java.util.Scanner;

public class Exo9Algo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
        int tab [] = {7,10,11,9,8};
		
		for (int i = 0; i < 5; i++) {
			
			System.out.println("la tab" +i+ " est égale à " +tab[i]);
			
			tab[0] = tab[2] + tab[3];
			tab[1] = 9;
			
			System.out.println("la tab" +i+ " est égale à " +tab[i]);
	  
	}
		int valeur = 0;
		Scanner clavier = new Scanner(System.in);
		valeur = clavier.nextInt();
		
		for (int i = 0; i < tab.length; i++) {
			
		}
		tab[4] = 8 + valeur;
		System.out.println("la valeur de la tab[4] est : " + tab[4]);
		
		
}
}
