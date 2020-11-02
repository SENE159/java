package Traitement_perso;
import java.util.Scanner;

public class Structure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner clavier = new Scanner(System.in);
    
    int age = 0;
    
    do {
    System.out.println("Entree votre age");
    age = clavier.nextInt();
    } while( age <= 0);


	

}
}