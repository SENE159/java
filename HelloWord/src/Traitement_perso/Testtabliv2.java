package Traitement_perso;

public class Testtabliv2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int tab[][] = new int[3][4];
  int lig,col;
  
  System.out.println("le nombre de colonne:" + tab.length);
  System.out.println("Le nombre de ligne d'une colonne : " + tab[0].length);
  
  for (lig = 0; lig < tab.length; lig++) 
  {
	  
	  for ( col = 0; col < tab.length; col++)
	  {
		  
		tab[lig][col] = lig + col;
	}
	  
	  for (lig = 0; lig < tab.length; lig++) 
	  {
		  for (col = 0; col < tab.length; col++) {
		
	}
	System.out.println(tab[lig][col] +"");
}
  
  System.out.println("\n");
	}

}
}
