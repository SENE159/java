package ExerciceAlgo3;
import java.util.Arrays;
import java.util.Scanner;

public class Exerc3Algo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner clavier = new Scanner(System.in);
		 int nombre = clavier.nextInt();
		 
		
		 int tab [] = new int [nombre];
		 int i = 0;
		   int somme = 0;
		   int produit = 1;
		   double moyenne = 1;

         for (i = 0; i < tab.length; i++) {
        	 tab[i] = clavier.nextInt();

      	   somme += tab[i] ;
      	   produit *= tab[i]*1;
      	   moyenne = somme/nombre;
     		
			
		}
			   
		System.out.println(Arrays.toString(tab));	
		System.out.println(somme);
		System.out.println(produit);
		System.out.println(moyenne);
	}

}
