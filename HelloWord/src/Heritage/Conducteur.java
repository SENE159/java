package Heritage;

public class Conducteur extends Homme {
  
	private boolean moteur;
	public Conducteur() {
		
		
}
	
	public void conduire() {
		
}
	public String demarrer() {
		if (this.moteur == true) {
			return "Le conducteur démarre sa voiture";
			
		}else {
			return "La voiture est à l'arret";
		}
}
	
		
	}

