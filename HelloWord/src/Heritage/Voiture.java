package Heritage;

public class Voiture extends Conducteur{
	
	private boolean moteur;
	private String portiere;
	private String pneu;

	
	public Voiture (boolean moteur, String portiere, String pneu) {
    this.moteur = true;
    this.portiere = portiere;
    this.pneu = pneu;
}
}
