package ExerciceAlgo1;
import java.util.Arrays;
import java.util.Scanner;

public class consulte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner clavier = new Scanner(System.in);
	
		double nombre = clavier.nextDouble();
		double tab [] = new double [6];
		

	    
		for (double i = 0; i < tab.length; i++) {
		System.out.println("tab" + i + " = " + tab[i]);
			
			
		}
		
		double var = clavier.nextDouble();
    
    if (var < tab.length ||var > tab.length ) {
    	
    	System.out.println("Pas de  consultation des �l�ments du tableau ");
    }else {
    	System.out.println("la valeur consulter du tableau est �gal �: " + var);
    }
    
    
    
	}

}
