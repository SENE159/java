package ExerciceAlgo3;
import java.util.ArrayList;
import java.util.Scanner;

public class Exer11Alg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner clavier = new Scanner(System.in);
  
  System.out.println("Entr�e un nombre pour la taille du tableau");
  int nombre = clavier.nextInt();
  int tab[] = new int[nombre + 3];
  
  for (int i = 1; i < nombre/2; i++) {
	  System.out.println("Entr�e une valeur � la position " +i+ " du tableau");
	  tab[i] = clavier.nextInt();
	  
}
  for (int i = (nombre/2) + 1; i < nombre; i++) {
	  System.out.println("Entr�e une valeur � la position " +i+ " du tableau");
	  tab[i] = clavier.nextInt();
		  
	}
ArrayList<Integer> array = new ArrayList<Integer>();

array.add(tab[0],8);
System.out.println(array.get(tab[0]));

array.add(tab[nombre/2],10);
System.out.println(array.get(tab[(nombre/2)]));

array.add(tab[nombre],7);
System.out.println(array.get(tab[nombre]));



}
}
	

