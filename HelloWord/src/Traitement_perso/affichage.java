package Traitement_perso;
import java.util.Scanner;

public class affichage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	// Affichage des dix nombres suivants un nombre saisi par l'utilisateur
		
		Scanner clavier = new Scanner(System.in);
		 int a = 0 ;
		 int b = a + 10;
        System.out.println("Entr�e un nombre");
        a = clavier.nextInt();
		for (int i = a  ; i <= a+10  ; i++) {
    	System.out.println("On aura l'affichage du nombre: " + i );
	}

}
}
