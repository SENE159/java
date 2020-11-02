package Traitement_perso;
import java.util.Scanner;

public class pmu {

	public static void main(String[] args) {
		// Tableau 1 affiche les cheveaux QUINTE GAGNANT
   
   int nombre1=0;
   int nombre2=0;
   int nombre3=0;
   int nombre4=0;
   int nombre5=0;
   int tab1 [] = {9,12,11,7,8};
   int tab2 []= new int [5];
   Scanner clavier = new Scanner(System.in);
   tab2[0]=nombre1= clavier.nextInt();
   System.out.println(tab2[0]);
   int i=0;
   System.out.println("le nombre1 parié par le jour est : " + nombre1 );
   
   tab2[1]=nombre2= clavier.nextInt();
   System.out.println(tab2[1]);
   System.out.println("le nombre2 parié par le jour est : " + nombre2  );
  
   tab2[2]=nombre3= clavier.nextInt();
   System.out.println(tab2[2]);
   System.out.println("le nombre3 parié par le jour est : " + nombre3  );
  
   tab2[3]=nombre4 = clavier.nextInt();
   System.out.println(tab2[3]);
   System.out.println("le nombre4 parié par le jour est : " + nombre4  );
   tab2[4]=nombre5= clavier.nextInt();
   System.out.println(tab2[4]);
   
   System.out.println("le nombre5 parié par le jour est : " + nombre5  );
   
   if (tab2[0]==9 && tab2[1]==12 && tab2[2]==11 && tab2[3]==7 && tab2[4]==8) {
	   System.out.println("le pari quinté est gagnant");
  
  } 
   if (tab2[0]==9 && tab2[1]==12 && tab2[2]==11 && tab2[3]==7 ) {
	  System.out.println("le pari quarté est gagnant");
	   }
   if (tab2[0]==9 && tab2[1]==12 && tab2[2]==11) {
		  System.out.println("le pari tierce est gagnant");
	 } else {
		 System.out.println("le pari est perdant");
}
}
}


