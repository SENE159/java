package Traitement_perso;
import java.util.Scanner;

public class Taboccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner clavier = new Scanner(System.in);
  
  int occurence = 0;
  
  System.out.println("Entr�e un nombre");
  int n = clavier.nextInt();
  int tab [] = new int [n];
  
  for (int i = 0; i < tab.length; i++) {
	  
	  System.out.println("Entr�e une valeur � la position " +i+" :");
	  Scanner clav = new Scanner(System.in);
	  tab[i] = clavier.nextInt();
	  
}
  
  System.out.println("Entr�e la valeur � chercher");
  int valeur = clavier.nextInt();
  
  for (int i = 0; i < tab.length; i++) {
	  if (tab[i] == valeur ) occurence++ ;
		  
		  
	  }
  System.out.println("La valeur " + valeur + " est pr�sente " + occurence+" fois dans le tableau");
}
  
	}


