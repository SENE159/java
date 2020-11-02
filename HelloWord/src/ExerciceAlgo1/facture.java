package ExerciceAlgo1;
import java.util.Scanner;

public class facture {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner clavier = new Scanner(System.in);
       
       double pages = 0.0;
       
       System.out.println("Combien de pages voulez vous photocopier?");
       pages = clavier.nextDouble();
       
       if (pages <= 10) {
    	   System.out.println("Le montant de la facture pour les 10 pages est: " + (0.10*10) + "euros");
       }else if (pages > 10 && pages < 30) {
    	   System.out.println("Le montant de la facture pour le 30 pages est: " + ((0.10*10) +(0.09*20)) + " euros");
       }else {
    	   System.out.println("Le montant de la facture pour plus de 30 pages est: " + ((0.10*10) +(0.09*20)) + " euros" + "pour les 30 premiéres pages et le reste à 0.08 la page");
       }
    		   
    		   
       
       
	}

}
