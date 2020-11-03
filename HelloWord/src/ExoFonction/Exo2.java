package ExoFonction;

public class Exo2 {
	
	public static void fonction1() {
		System.out.println("debut de la fonction1");
		fonction2();
		System.out.println("fin de la fonction1");
	}
   public static void fonction2() {
		System.out.println("debut de la fonction2");
		fonction3();
		System.out.println("fin de la fonction2");
	}
 public static void fonction3() {
		System.out.println("debut de la fonction3");
		
		System.out.println("fin de la fonction3");
	}

public static void main(String[] args) {
	System.out.println("debut de la fonction main");
	fonction1();
	System.out.println("fin de la fonction main");	
	

	}

}
