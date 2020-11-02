package ExerciceAlgo1;
import java.util.Scanner;

public class date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner clavier = new Scanner(System.in);
   
   int jour = 0;
   int mois = 0;
   int année = 0;
   int B = 0;
   System.out.println("Entrée le numéro du jour");
   jour = clavier.nextInt();
   
   System.out.println("Entrée le mois");
   mois = clavier.nextInt();
   
   System.out.println("Entrée l'année");
   année = clavier.nextInt();
  
   
    
    if (jour== 31 && mois == 1 || mois == 3 || mois == 5 || mois== 7|| mois==8 || mois==10 ||mois==12) {
    	System.out.println("La date est valide");
    
    	
    }else {
    	System.out.println("la date n'est pas valide");
    }
    
    if (jour== 30 && mois == 4 || mois == 6 || mois == 9 || mois==11) {
    	System.out.println("La date est valide");
    	
    }else {
    	System.out.println("la date n'est pas valide");
    }
    
    if (jour== 29 && mois == 2 && (année%400==0 && année%4==0 && !(année%100==0))) {
    	System.out.println("La date est valide");
    	
    }else {
    	System.out.println("la date n'est pas valide");
    }
    
   
		   
	}

}
