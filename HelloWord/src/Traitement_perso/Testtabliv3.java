package Traitement_perso;

public class Testtabliv3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int tab[][] = new int[3] [];
   int lig,col;
   
   System.out.println("nombre de ligne :" +tab.length);
   
	
    
	for(lig = 0; lig < 3;lig++) {
	
		tab[lig] = new int[lig + 1];
	
	}
	for(lig = 0; lig < 3;lig++) 
	{
	for(col = 0; col < tab[lig].length;col++)
	{

	System.out.print(tab[lig][col] +" ");
	
	}
	System.out.print("\n");
	}
}
}
