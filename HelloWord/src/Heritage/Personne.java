package Heritage;

import java.sql.Date;

public class Personne {

	private String nom;
	private Date date_naissance;
	private int salaire;
	
	public Personne() {
		
}
	
	public int salairepayer() {
		return 1000;
	}
	
	public int Calculprime() {
		if (salaire < 1000) {
		return 250;
	}else {
		return 0;
	}
		
		}
			
		}


