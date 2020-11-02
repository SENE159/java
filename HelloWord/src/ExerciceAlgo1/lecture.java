package ExerciceAlgo1;
import java.util.Scanner;

public class lecture {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner clavier = new Scanner(System.in);
   
   Double n = 0.0 ;
   String stri1 = "";
   String stri2 = "";
   
   System.out.println("Entrée un nombre réel :"  );
   n = clavier.nextDouble();
   clavier.nextLine();
   
   System.out.println("Entrée une chaine de caractere :"  );
   stri1 = clavier.nextLine();
   
   System.out.println("Entrée un nombre réel :" );
   stri2 = clavier.nextLine();
   
   System.out.println("Vous avez tapé : " + n);
   System.out.println("Vous avez tapé : " + stri1);
   System.out.println("Vous avez tapé : " + stri2);
		   
   
   
  
   
   
   
	}

}
