package ExerciceAlgo3;
import java.util.ArrayList;
import java.util.Scanner;

public class Exer11Algo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner clavier = new Scanner(System.in);
		  
		  System.out.println("Entrée un nombre pour la taille du tableau");
		  int nombre = clavier.nextInt();
		  int tab [] = new int [nombre + 1];
		  
		  for (int i = 0; i < nombre; i++) {
			  System.out.println(" Entrée la position " + i + " du tableau");
			  tab [i] = clavier.nextInt();
			
		}
		  ArrayList<Integer> array = new ArrayList<Integer>();
		  
		  array.set(tab[1],tab[1]);
		  array.add(tab[1], 5);
		  
		  
		  System.out.println(array.get(tab[1]));
		  
		 
	}

}
