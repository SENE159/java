package ExerciceAlgo3;
import java.util.Scanner;

public class Exerc7Algo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner clavier = new Scanner(System.in);
		
		int occurence = 0;
		
		System.out.println("Entr�e un nombre");
		int n = clavier.nextInt();
		int tab[] = new int [n];
		
		for (int i = 0; i < n; i++) {
			
			System.out.println("Entr�e le nombre � la position " + i + " :");
			Scanner clav1 = new Scanner(System.in);
			tab[i] = clav1.nextInt();	
			
		}
		
		System.out.println("Entr�e la valeur � chercher dans le tableau");
		int valeur = clavier.nextInt();
		
		for (int i = n - 1; i <= n && occurence < 1 ; i--) 
		{
			if (tab[i] == valeur) 
			{
			
				occurence = occurence + 1;
				System.out.println("la position de la derniere occurence de la valeur est :" +i);	
			
		
	}	
			
            		
            
	}

}
}
