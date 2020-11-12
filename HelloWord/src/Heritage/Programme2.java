package Heritage;

public class Programme2 {

	

	public static void main(String[] args) {
		Homme homme = new Homme();
		
		Conducteur conducteur = new Conducteur();
		
		
		System.out.println(conducteur.demarrer());
		System.out.println(conducteur.parler());
		System.out.println(conducteur.manger());
		System.out.println(conducteur.boire());
	}

}
