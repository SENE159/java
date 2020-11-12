package Heritage;

public class Employe extends Personne {
	private float salaire ;
	
	public Employe() {

   this.setSalaire(1500);
	}

	
	public float getSalaire() {
		return salaire;
	}

	public void setSalaire(float salaire) {
		this.salaire = salaire;
	}
	public int Calculprime() {
		if (salaire < 1000) {
		return 250;
	}else {
		return 0;
}
	}
}
