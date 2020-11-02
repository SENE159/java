package Traitement_perso;
import java.util.Scanner;

public class nombresec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int nombre_secret , nombre_user ;
  
  Scanner clavier = new Scanner(System.in);
  
  nombre_secret = (int)(Math.random() * 999) + 1;
  
  do {
	  System.out.println("Entrée un nombre");
	  nombre_user = clavier.nextInt();
	  
	  if (nombre_user == nombre_secret) {
		  System.out.println("Bravo");
	  }else if (nombre_user > nombre_secret){
	  System.out.println("le nombre est trop grand");  
	  }else {
		  System.out.println("le nombre est trop petit");
	  
  }while (nombre_user != nombre_secret);
 
  
  
  }
		  
  
	
}
  
}

	  

