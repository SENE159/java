package Traitement_perso;
import java.util.Scanner;

public class achat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner clavier = new Scanner(System.in);
  
  int article = 0;
  int montant = 0;
 
		  do {
		  System.out.println("Entr�e le prix de l'article du client");
          article = clavier.nextInt();
          
          System.out.println("Entr�e le prix de le montant donner par le client pour payer l'article");
          montant = clavier.nextInt();
          
          int monnaie = montant - article;
          
          System.out.println("Pour un article coutant " + article + " euros et un montant donner " + montant + " euros donner par le client pour payer, la monnaie � rendre est de : "+  monnaie +" euros" );
	}while (article !=  0);

}
}

