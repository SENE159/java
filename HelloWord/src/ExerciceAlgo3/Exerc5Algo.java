package ExerciceAlgo3;
import java.util.Scanner;

public class Exerc5Algo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner clavier = new Scanner(System.in);
		 int nombre = clavier.nextInt();
		 
		
		 int tab [] = new int [nombre];

       for (int i = 0; i < tab.length; i++) {
      	 tab[i] = clavier.nextInt();
      	 
      	
      	 }
       for (int i = 0; i < tab.length; i++) {
   	
       System.out.println("la tab[ " + i + " ] est egale à : " + tab[i]);
}
       
       
       int valeur  = 0; // La valeur à chercher dans le tableau
       int occurence = 0; // nombre de fois que la valeur est consulter dans le tableau
       int indice = - 1;


       for (int i = 0; i < tab.length; i++) {
    	   if ( tab[i] == valeur) {
    	   
    	   System.out.println("retourne" + i);
		
	}else 
		System.out.println("retourne" + indice);
		

    	  
       }
       
	   
	}
}


