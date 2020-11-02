package ExerciceAlgo3;
import java.util.Scanner;

public class Exer8Algo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner clavier = new Scanner(System.in);
		 int nombre = clavier.nextInt();
		 int tab [] = new int [nombre];

      for (int i = 0; i < tab.length; i++) 
      {
     	 tab[i] = clavier.nextInt();
     	 
     	
     	 }
      for (int i = 0; i < tab.length; i++) 
      {
      System.out.println("la tab[ " + i + " ] est egale à : " + tab[i]);
}
      
      int compteur = 0;
      for (int i = 0; i < tab.length; i++) 
      {
    	  compteur = 0; 
    	  
    	  for (int j = 0; j < tab.length; j++) {
    		  
    		  if(tab[i] == tab[j]) 
    		  {
    			  compteur++;
    		  }
    		  
		}
    	  System.out.println(tab[i] + " est présent " + compteur + " fois");
	}
		
	}
     
      
      }

	  

      
      
	   
	


