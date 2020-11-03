package ExerciceAlgo3;

public class Exer13Algo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
	 int tab[] = {5,7,10,11,8,14};
	 
	 // indice pour parcourir 
	 
	 int i = 0; 
	 
	 //variable pour permuter les valeurs du tableau
	
	 int permutation = 0;
	 
	 int nombrepermut = 0;
	 
	 do {
		 nombrepermut = 0;
		 
		 for(i= 0; i <= 4; i++) 
		 {
			 if (tab[i] > tab[i+1]) 
			 {
				 permutation = tab[i];
				 tab[i] = tab[i+1];
				 tab[i + 1] = permutation;
				 
				  nombrepermut++;
			 }
		 }
	 }
	 
	 
	 while (nombrepermut != 0);
	 
	
	

	for (i= 0; i<= 5; i++) {
	
	System.out.println(tab[i]);
  
	}
}
}

