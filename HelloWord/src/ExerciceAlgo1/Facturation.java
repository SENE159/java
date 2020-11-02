package ExerciceAlgo1;
import java.util.Scanner;

public class Facturation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner clavier = new Scanner(System.in);
     
     double pages = 0.0;
     
     System.out.println("Combien de pages voulez vous photocopier?");
     pages = clavier.nextDouble();
     
     if (pages <= 10) {
    	 System.out.println("le montant de votre facture est :" + (0.10*10)+" euros");
    	  
     }else  if( pages > 10 && pages < 30) 
  
    	 System.out.println("le montant de votre facture est :" + ((0.10*10)+(0.09*20)) );	 
     else 
     
    	 System.out.println("le montant de votre facture est :" + ((0.10*10)+(0.09*20)) +" pour les 30 premieres pages " +" le reste à 0.08 la page");
     
	}

}
