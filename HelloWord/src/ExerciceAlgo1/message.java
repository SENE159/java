package ExerciceAlgo1;
import java.util.Scanner;

public class message {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		Scanner clavier = new Scanner(System.in);
		
		int nombre = 0;
		
		do {
			System.out.println("Entrée un nombre");
			nombre = clavier.nextInt();
			
			if (nombre < 10) {
				System.out.println("le nombre est trop petit");
				
			}
			if (nombre > 20) {
				System.out.println("le nombre est trop grand");
			}
		
		}while (nombre !=15);
		
		
		
	}

}