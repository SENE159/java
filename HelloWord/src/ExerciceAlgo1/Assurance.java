package ExerciceAlgo1;
import java.util.Scanner;

public class Assurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner clavier = new Scanner(System.in);
     
     int age = 0;
     int Naop = 0;
     int Nac = 0;
     int NACL=0;
     String couleur = null;
     
     
     
     System.out.println("Indiquez le nombre d'ann�es que vous �tes client de l'agence");
     NACL = clavier.nextInt();
     clavier.nextLine();
     
     if(NACL>=5) {
     System.out.println("Dans le cadre de la fid�lisation de la client�le, votre tarification passe � la gamme sup�rieur ");
     
     System.out.println("Indiquez la couleur de votre tarification");
     couleur = clavier.nextLine();
     
     String bleu = "bleu";
     String vert = "vert";
     String orange = "orange";
     String rouge = "rouge";
     
     if (couleur.equals("vert")) {
    	 System.out.println("Vous passer � la tarification bleu");
    	 
     }else if (couleur.equals("orange")) {
    	 System.out.println("Vous passer � la tarification vert");
    	 
     }else  (couleur.equals("rouge")) {
    	 System.out.println("Vous passer � la tarification vert");
    	 
     
        
    
	 else if (NACL<5) {
		
     System.out.println("Entr�e votre age?");
     age = clavier.nextInt();
     System.out.println("Entr�e le nombre d'ann�e d'obtention de votre permis de conduire?");
     Naop = clavier.nextInt();
     System.out.println("Entr�e le nombre d'accidents que vous avez eu?");
     Nac = clavier.nextInt();
     
     if (age<25 && Naop < 2 && Nac< 1) {
    	System.out.println("Vous pouvez beneficier au sein de notre agence une tarification ROUGE");
    	
     } else {
    	 System.out.println("Notre agence refuse de vous assurer");
     }
     
     if (age>25 && Naop < 2 || age<25 && Naop > 2 && Nac< 1) {
     System.out.println("Vous pouvez beneficier au sein de notre agence une tarification ORANGE");
     
}else if(age>25 && Naop < 2 || age<25 && Naop > 2 && Nac< 2) {
	System.out.println("Vous pouvez beneficier au sein de notre agence une tarification ROUGE");
}else {
	System.out.println("Notre agence refuse de vous assurer");
	
	if (age>25 && Naop > 2 && Nac< 0 || age>25 && Naop > 2 && Nac < 2 || age>25 && Naop > 2 && Nac< 3 ) {
		System.out.println("Vous pouvez beneficier au sein de notre agence une tarification VERT");
		
	}
}
}
                 }
     
     }	
	


