package Traitement_perso;
import java.util.Scanner;

public class occurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int tab [] = {1,3,8,5,14,3,3,5,12,7};
   int i = 0; //indice de parcours du tableau
   int valeur = 0; //Valeur � chercher dans le tableau
   int nombre = 0; // Nombre de fois ou valeur est dans le tableau
   
   Scanner clavier = new Scanner(System.in);
   valeur = clavier.nextInt();
   
   for (i = 0; i < tab.length; i++) {
	if(tab[i] == valeur) nombre++;
}
   System.out.printf("\n\nla valeur %d est presente %d fois dans le tableau\n\n",
   valeur,nombre);
   
   
	}
	
	}


