package ExerciceAlgo1;
import java.util.Scanner;

public class lecture {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner clavier = new Scanner(System.in);
   
   Double n = 0.0 ;
   String stri1 = "";
   String stri2 = "";
   
   System.out.println("Entr�e un nombre r�el :"  );
   n = clavier.nextDouble();
   clavier.nextLine();
   
   System.out.println("Entr�e une chaine de caractere :"  );
   stri1 = clavier.nextLine();
   
   System.out.println("Entr�e un nombre r�el :" );
   stri2 = clavier.nextLine();
   
   System.out.println("Vous avez tap� : " + n);
   System.out.println("Vous avez tap� : " + stri1);
   System.out.println("Vous avez tap� : " + stri2);
		   
   
   
  
   
   
   
	}

}
