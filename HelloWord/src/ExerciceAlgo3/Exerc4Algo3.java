package ExerciceAlgo3;
import java.util.Scanner;

public class Exerc4Algo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner clavier = new Scanner(System.in);
		 int nombre = clavier.nextInt();
		 
		
		 int tab [] = new int [nombre];

        for (int i = 0; i < tab.length; i++) {
       	 tab[i] = clavier.nextInt();
       	 
       	
       	 }
        for (int i = 0; i < tab.length; i++) {
    	
        System.out.println("la tab[ " + i + " ] est egale � : " + tab[i]);
}
        
        int n = 0; // L'indice qui va parcours l'ensemble des �l�ments du tableau
       
        for (n =0 ; n < tab.length; n++);
        n = clavier.nextInt();
      System.out.println("la valeur du tableau � l'indice " + n + " est �gale � " + tab[n]);
        
    	  
           
      
}
	 
}


