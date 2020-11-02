package ExerciceAlgo1;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner clavier = new Scanner(System.in);
   
   int article = 0;
   int montant = 0;
   
   
   System.out.println("Entrée le prix de l'article du client");
   article = clavier.nextInt();
   
   System.out.println("Entrée le montant donner par le client pour payer");
   montant = clavier.nextInt();
   
   int monnaie = montant - article;
   System.out.println("Pour un article coutant " + article + " euros et un montant de " + montant + " euros donner par le client, la monnaie à rendre au client est : " + monnaie + " euros");
   
	}

}
