package ExerciceAlgo3;
import java.util.Arrays;
import java.util.Scanner;

public class Exer2Algo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner clavier = new Scanner(System.in);
		 int nombre = clavier.nextInt();
		 
		
		 int tab [] = new int [nombre];

         for (int i = 0; i < tab.length; i++) {
        	 tab[i] = clavier.nextInt();
     		
     		
			
		}
			   
		System.out.println(Arrays.toString(tab));	   
			  
	}
	}

