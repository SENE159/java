package ExerciceAlgo3;
import java.util.ArrayList;
import java.util.Scanner;

public class Exer10Algo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner clavier = new Scanner(System.in);
  
  System.out.println("Entr�e un nombre pour la taille du tableau");
  int nombre = clavier.nextInt();
  int tab [] = new int [nombre];
  
  for (int i = 0; i < nombre; i++) {
	  System.out.println(" Entr�e la position " + i + " du tableau");
	  tab [i] = clavier.nextInt();
	
}
ArrayList<Integer> array = new ArrayList<Integer>();
  
  array.set(tab[2], tab[2]);
  array.add(tab[2], 12);
  
  System.out.println(array.get(tab[2]));
	
}
}
