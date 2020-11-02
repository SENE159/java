package ExerciceAlgo1;
import java.util.Scanner;

public class factorielle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner clavier = new Scanner(System.in);
		int nombre = clavier.nextInt();
		int resultat = 0;

		
		for(int i = 1; i <= nombre ; i++)
		{
			resultat = resultat*i ;
			
			System.out.println(resultat);
			
		}
		
	}

}
