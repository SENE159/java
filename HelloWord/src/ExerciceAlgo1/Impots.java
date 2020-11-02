package ExerciceAlgo1;
import java.util.Scanner;

public class Impots {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner clavier = new Scanner(System.in);
	     
	     int age = 0;
	     String sexe ="";
	     
	     System.out.println("Pouvez vous entrer votre age?");
	     age = clavier.nextInt();
	     clavier.nextLine();
	     
	     System.out.println("Vous etes de sexe masculin ou feminin?");
	     sexe = clavier.nextLine();
	     
	     if (age > 20 && sexe = "masculin") {
	    	 System.out.println("Vous etes imposable");
	    	 
	     }else {
	    	 System.out.println("Vous n'etes pas imposable");
	     }
	     if (18< age > 35 && sexe = "feminin") {
	    	 System.out.println("Vous etes imposable");
	    	 
	     }else {
	    	 System.out.println("Vous n'etes pas imposable");
	     }
	    
	     
	     
	}

}
