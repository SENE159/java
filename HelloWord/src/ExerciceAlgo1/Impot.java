package ExerciceAlgo1;
import java.util.Scanner;

public class Impot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner clavier = new Scanner(System.in);
    
    int age = 0;
    String sexe;
    
    
    System.out.println("Pouvez vous indiquer votre age?");
    age = clavier.nextInt();
    clavier.nextLine();
    
    System.out.println("Vous étes de sexe masculin ou feminin?");
    sexe = clavier.nextLine();
    
    
    
    if(age > 20 &&  sexe.equals("masculin")) {
    	System.out.println("Vous étes imposable");
    	
    }else {
    	System.out.println("Vous n'étes pas imposable");
    	
    }
    if(age >18 && age<35 &&  sexe.equals("feminin")) {
    	System.out.println("Vous étes imposable");
    	
    }else {
    	System.out.println("Vous n'étes pas imposable");
    
  
  
	}

	}
}
