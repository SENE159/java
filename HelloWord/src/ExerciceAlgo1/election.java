package ExerciceAlgo1;
import java.util.Scanner;

public class election {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner clavier = new Scanner(System.in);
    
    double score1 = 0.0;
    double score2 = 0.0;
    double score3 = 0.0;
    double score4 = 0.0;
    
    System.out.println("Pouvez vous saisir le score1 du candidat numero 1");
    score1 = clavier.nextDouble();
    
    if(score1 >=50) {
    	System.out.println("le candidat numero 1 est élu au premier tour.");
    }else if (score1<12.5) {
    	System.out.println("le candidat numéro 1 est éliminé au premier tour");
    }else {
    	System.out.println("le candidat numéro 1 est au balotage favorable ou défavorable");
    }
    
    
	}

}
